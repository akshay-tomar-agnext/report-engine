package com.agnext.reporting.service.impl;

import com.agnext.reporting.enums.Constants;
import com.agnext.reporting.adapter.MapStructMapper;
import com.agnext.reporting.entity.report.ScanReportEntity;
import com.agnext.reporting.enums.Commodity;
import com.agnext.reporting.enums.Customer;
import com.agnext.reporting.model.MCSModel;
import com.agnext.reporting.model.ScanReportModel;
import com.agnext.reporting.model.kcs.KCSJowrModel;
import com.agnext.reporting.model.kcs.KCSPaddyModel;
import com.agnext.reporting.model.kcs.KCSRagiModel;
import com.agnext.reporting.repository.report.ScanReportRepository;
import com.agnext.reporting.service.ReportGeneratorService;
import lombok.AllArgsConstructor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.agnext.reporting.enums.Constants.DEFAULT_ZONE;

@Service
@AllArgsConstructor
public class ReportGeneratorServiceImpl implements ReportGeneratorService {

    private final ExcelGenerationServiceImpl excelService;
    private final ScanReportRepository reportRepository;
    private final EmailSenderServiceImpl senderService;
    private final MapStructMapper mapStructMapper = Mappers.getMapper(MapStructMapper.class);

    @Override
    public void generateReport(LocalDateTime startDate, LocalDateTime endDate, Long days, Long customerId, String[] emails)
            throws IOException, NoSuchFieldException, IllegalAccessException {
        if (startDate == null) {
            if (days == null)
                startDate = endDate;
            else
                startDate = endDate.minusDays(days);
        }
        List<ScanReportEntity> reportEntities = reportRepository
                .findByCustomerIdAndCreatedOnBetween(Long.toString(customerId),
                        Long.toString(toEpochMillis(LocalDate.from(startDate))),
                        Long.toString(toEpochMillis(LocalDate.from(endDate))));

        List<ScanReportModel> reportModels = reportEntities
                .stream()
                .map(mapStructMapper::ScanReportEntityToScanReportModel)
                .collect(Collectors.toList());

        ByteArrayInputStream inputStream = null;
        if (customerId.equals(Customer.KCS.getCode())) {
            inputStream = KCSReport(reportModels);
        } else if (customerId.equals(Customer.MCS.getCode())) {
            inputStream = MCSReport(reportModels);
        }
        senderService.sendEmail(emails, inputStream);
    }


    private ByteArrayInputStream MCSReport(List<ScanReportModel> reportModels) throws IOException,
            NoSuchFieldException, IllegalAccessException {
        List<MCSModel> mcsModelList = reportModels
                .stream()
                .map(mapStructMapper::ScanReportModelToMCSModel)
                .collect(Collectors.toList());

        ByteArrayInputStream inputStream;
        XSSFWorkbook workbook = new XSSFWorkbook();
        if (mcsModelList.isEmpty())
            mcsModelList.add(new MCSModel());
        inputStream = excelService.generateExcelSheet(workbook, Constants.SCAN_REPORT, mcsModelList);
        workbook.close();
        return inputStream;
    }

    private long toEpochMillis(LocalDate date) {
        return date.atStartOfDay(ZoneId.of(DEFAULT_ZONE)).toEpochSecond() * 1000;
    }

    private ByteArrayInputStream KCSReport(List<ScanReportModel> reportModels) throws IOException,
            NoSuchFieldException, IllegalAccessException {
        List<KCSRagiModel> kcsRagiModelList = new ArrayList<>();
        List<KCSPaddyModel> kcsPaddyModelList = new ArrayList<>();
        List<KCSJowrModel> kcsJowrModelList = new ArrayList<>();
        reportModels.forEach(scanReport -> {
            if (scanReport.getCommodityName().equalsIgnoreCase(Commodity.RAGI.getName())) {
                kcsRagiModelList.add(mapStructMapper.ScanReportModelToKCSRagiModel(scanReport));
            } else if (scanReport.getCommodityName().equalsIgnoreCase(Commodity.PADDY.getName())) {
                kcsPaddyModelList.add((mapStructMapper.ScanReportModelToKCSPaddyModel(scanReport)));
            } else if (scanReport.getCommodityName().equalsIgnoreCase(Commodity.JOWR.getName())) {
                kcsJowrModelList.add(mapStructMapper.ScanReportModelToKCSJowrModel(scanReport));
            }
        });
        ByteArrayInputStream inputStream;
        XSSFWorkbook workbook = new XSSFWorkbook();
        if (kcsRagiModelList.isEmpty())
            kcsRagiModelList.add(new KCSRagiModel());
        excelService.generateExcelSheet(workbook, Commodity.RAGI.getName(), kcsRagiModelList);
        if (kcsPaddyModelList.isEmpty())
            kcsPaddyModelList.add(new KCSPaddyModel());
        excelService.generateExcelSheet(workbook, Commodity.PADDY.getName(), kcsPaddyModelList);
        if (kcsJowrModelList.isEmpty())
            kcsJowrModelList.add(new KCSJowrModel());
        inputStream = excelService.generateExcelSheet(workbook, Commodity.JOWR.getName(), kcsJowrModelList);
        workbook.close();
        return inputStream;
    }
}
