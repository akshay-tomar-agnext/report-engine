package com.agnext.reporting.service.impl;

import com.agnext.reporting.adapter.MapStructMapper;
import com.agnext.reporting.entity.report.ScanReportEntity;
import com.agnext.reporting.enums.Commodity;
import com.agnext.reporting.enums.Customer;
import com.agnext.reporting.enums.DGLocation;
import com.agnext.reporting.model.EmailData;
import com.agnext.reporting.model.ScanReportModel;
import com.agnext.reporting.model.dg.DGModel;
import com.agnext.reporting.model.kcs.KCSJowrModel;
import com.agnext.reporting.model.kcs.KCSPaddyModel;
import com.agnext.reporting.model.kcs.KCSRagiModel;
import com.agnext.reporting.model.mcs.MCSModel;
import com.agnext.reporting.repository.report.ScanReportRepository;
import com.agnext.reporting.service.ReportGeneratorService;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
    public void generateReport(LocalDate startDate, LocalDate endDate, Long days, Long customerId, EmailData emailData)
            throws IOException, NoSuchFieldException, IllegalAccessException {
        if (startDate == null) {
            if (days == null)
                startDate = endDate;
            else
                startDate = endDate.minusDays(days);
        }
        List<ScanReportEntity> reportEntities = reportRepository
                .findByCustomerId(Long.toString(customerId));

        LocalDate finalStartDate = startDate;
        List<ScanReportModel> reportModels = reportEntities
                .stream()
                .filter(scanReportEntity -> (StringToDate(scanReportEntity.getCreatedOnDate()).isAfter(finalStartDate) &&
                        (StringToDate(scanReportEntity.getCreatedOnDate()).isBefore(endDate))))
                .map(mapStructMapper::ScanReportEntityToScanReportModel)
                .collect(Collectors.toList());

        ByteArrayInputStream inputStream = null;
        if (customerId.equals(Customer.KCS.getCode())) {
            inputStream = KCSReport(reportModels);
            senderService.sendEmail(emailData, inputStream);
        } else if (customerId.equals(Customer.MCS.getCode())) {
            inputStream = MCSReport(reportModels);
            senderService.sendEmail(emailData, inputStream);
        } else if (customerId.equals(Customer.DIGITAL_GREENS.getCode())) {
            inputStream = DGReport(reportModels);
            senderService.sendEmail(emailData, inputStream);
        }
    }

    private ByteArrayInputStream DGReport(List<ScanReportModel> reportModels) throws IOException, NoSuchFieldException, IllegalAccessException {
        List<DGModel> kolithad = new ArrayList<>();
        List<DGModel> chandralapadu = new ArrayList<>();
        List<DGModel> guntur = new ArrayList<>();
        List<DGModel> vatsavai = new ArrayList<>();
        reportModels.forEach(scanReport -> {
            if(scanReport.getCapsaicin() != null)
                scanReport.setCapsaicin(String.valueOf(Math.round(Math.exp(Double.valueOf(scanReport.getCapsaicin())))));
            if (StringUtils.equalsIgnoreCase(scanReport.getLocation(), DGLocation.KOLITHAD.getCode()))
                kolithad.add(mapStructMapper.ScanReportModelToDGModel(scanReport));
            else if (StringUtils.equalsIgnoreCase(scanReport.getLocation(), DGLocation.CHANDRALAPADU.getCode()))
                chandralapadu.add(mapStructMapper.ScanReportModelToDGModel(scanReport));
            else if (StringUtils.equalsIgnoreCase(scanReport.getLocation(), DGLocation.GUNTUR.getCode()))
                guntur.add(mapStructMapper.ScanReportModelToDGModel(scanReport));
            else if (StringUtils.equalsIgnoreCase(scanReport.getLocation(), DGLocation.VATSAVAI.getCode()))
                vatsavai.add(mapStructMapper.ScanReportModelToDGModel(scanReport));
        });
        ByteArrayInputStream inputStream;
        XSSFWorkbook workbook = new XSSFWorkbook();
        if (CollectionUtils.isEmpty(kolithad))
            kolithad.add(new DGModel());
        excelService.generateExcelSheet(workbook, DGLocation.KOLITHAD.getName(), kolithad);
        if (CollectionUtils.isEmpty(chandralapadu))
            chandralapadu.add(new DGModel());
        excelService.generateExcelSheet(workbook, DGLocation.CHANDRALAPADU.getName(), chandralapadu);
        if (CollectionUtils.isEmpty(guntur))
            guntur.add(new DGModel());
        excelService.generateExcelSheet(workbook, DGLocation.GUNTUR.getName(), guntur);
        if (CollectionUtils.isEmpty(vatsavai))
            vatsavai.add(new DGModel());
        inputStream = excelService.generateExcelSheet(workbook, DGLocation.VATSAVAI.getName(), vatsavai);
        workbook.close();
        return inputStream;
    }

    private ByteArrayInputStream MCSReport(List<ScanReportModel> reportModels) throws IOException,
            NoSuchFieldException, IllegalAccessException {
        List<MCSModel> riceList = new ArrayList<>();
        List<MCSModel> paddyList = new ArrayList<>();
        reportModels.forEach(scanReport -> {
            if (StringUtils.equalsIgnoreCase(scanReport.getCommodityName(), Commodity.PADDY.getName()))
                paddyList.add(mapStructMapper.ScanReportModelToMCSModel(scanReport));
            else if (StringUtils.equalsIgnoreCase(scanReport.getCommodityName(), Commodity.RICE.getName()))
                riceList.add(mapStructMapper.ScanReportModelToMCSModel(scanReport));
        });
        ByteArrayInputStream inputStream;
        XSSFWorkbook workbook = new XSSFWorkbook();
        if (CollectionUtils.isEmpty(riceList))
            riceList.add(new MCSModel());
        excelService.generateExcelSheet(workbook, Commodity.RICE.getName(), riceList);
        if (CollectionUtils.isEmpty(paddyList))
            paddyList.add(new MCSModel());
        inputStream = excelService.generateExcelSheet(workbook, Commodity.PADDY.getName(), paddyList);
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
            } else if (scanReport.getCommodityName().equalsIgnoreCase(Commodity.JOWAR.getName())) {
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
        inputStream = excelService.generateExcelSheet(workbook, Commodity.JOWAR.getName(), kcsJowrModelList);
        workbook.close();
        return inputStream;
    }

    public LocalDate StringToDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy, hh:mm a");
        return LocalDate.parse(date, formatter);
    }
}
