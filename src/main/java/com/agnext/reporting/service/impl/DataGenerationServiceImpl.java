package com.agnext.reporting.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.agnext.reporting.adapter.MapStructMapper;
import com.agnext.reporting.entity.dg.DGScanEntity;
import com.agnext.reporting.entity.dg.DGScanResultEntity;
import com.agnext.reporting.enums.Customer;
import com.agnext.reporting.repository.dg.DGScanRepository;
import com.agnext.reporting.repository.dg.DGScanResultRepository;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.InsertOptions;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.agnext.reporting.configuration.analytics.AnalyticsDetail;
import com.agnext.reporting.entity.report.ScanReportEntity;
import com.agnext.reporting.entity.scan.ScanEntity;
import com.agnext.reporting.entity.scan.ScanResultEntity;
import com.agnext.reporting.enums.Analytics;
import com.agnext.reporting.repository.report.ScanReportRepository;
import com.agnext.reporting.repository.scan.ScanRepository;
import com.agnext.reporting.repository.scan.ScanResultRepository;
import com.agnext.reporting.service.DataGenerationService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service
@AllArgsConstructor
@Slf4j
public class DataGenerationServiceImpl implements DataGenerationService {

    private final AnalyticsDetail analyticsDetail;
    private final ScanReportRepository reportRepository;
    private final ScanResultRepository scanResultRepository;
    private final ScanRepository scanRepository;
    private final DGScanRepository dgScanRepository;
    private final DGScanResultRepository dgScanResultRepository;
    private final MapStructMapper mapStructMapper = Mappers.getMapper(MapStructMapper.class);

    @Autowired
    private CassandraOperations cassandraTemplate;

    @Override
    @Scheduled(fixedDelay = 43200000)
    public void dataMigration() throws NoSuchFieldException, IllegalAccessException {
        Map<String, String> map = analyticsDetail.getAnalysisNameFromVariations();
        Long[] customer = {Customer.DIGITAL_GREENS.getCode(),Customer.MCS.getCode(),Customer.KCS.getCode()};
        for (Long id : customer) {
            if(id.equals(Customer.DIGITAL_GREENS.getCode())){
                DGDataMigration();
                continue;
            }
            ScanReportEntity scanReportEntity = reportRepository.findTopByOrderByScanIdDesc(String.valueOf(id));
            log.info("Merging assaying-prod scan and scan results");
            List<ScanEntity> scanList;
            if (scanReportEntity == null) {
                ScanEntity scanEntity = scanRepository.findTopByCustomerIdAndIdOrderByIdAsc(id);
                scanList = List.of(scanEntity);
            } else {
                scanList = scanRepository.findByCustomerIdAndIdGreaterThanAndIsValid(id, scanReportEntity.getScanId(), true);
            }
            saveData(map, scanList);
        }
        log.info("Assaying-prod scans merged successfully");
    }

    private void saveData(Map<String, String> map, List<ScanEntity> scanList) throws NoSuchFieldException, IllegalAccessException {
        for (ScanEntity scanEntity : scanList) {
            ScanReportEntity scanReport = mapStructMapper.ScanEntityToScanReportEntity(scanEntity);
            List<ScanResultEntity> scanResultList = scanResultRepository.findByScanEntityId(scanEntity.getId());
            for (ScanResultEntity scanResult : scanResultList) {
                if (map.containsKey(scanResult.getAnalysisName())) {
                    String analysisName = map.get(scanResult.getAnalysisName());
                    String analysisType = scanResult.getAnalysisType();
                    Optional<Analytics> columnName = Analytics.getFieldByAnalysisName(analysisName, analysisType);
                    if (columnName.isPresent() && scanResult.getResult() != null)
                        scanReport.setField(columnName.get().getColumnName(), scanResult.getResult());
                }
            }
            InsertOptions a = InsertOptions.builder().withInsertNulls(false).build();
            cassandraTemplate.insert(scanReport, a);
            log.info("Scan merge is : {}", scanEntity.getId());
            // reportRepository.save(scanReport);
        }
    }

    @Override
    public void DGDataMigration() throws NoSuchFieldException, IllegalAccessException {
        log.info("Merging chilly scan and scan results");
        Map<String, String> map = analyticsDetail.getAnalysisNameFromVariations();
        ScanReportEntity scanReportEntity = reportRepository.findTopByOrderByScanIdDesc(String.valueOf(Customer.DIGITAL_GREENS.getCode()));
        List<DGScanEntity> dgScanEntities;
        if (scanReportEntity == null) {
            DGScanEntity dgScanEntity = dgScanRepository.findTopByOrderById();
            dgScanEntities = List.of(dgScanEntity);
        } else {
            dgScanEntities = dgScanRepository.findByIdGreaterThanAndIsValid(scanReportEntity.getScanId(), true);
        }
        saveDataChilly(map, dgScanEntities);
    }

    private void saveDataChilly(Map<String, String> map, List<DGScanEntity> scanList) throws NoSuchFieldException, IllegalAccessException {
        for (DGScanEntity scanEntity : scanList) {
            ScanReportEntity scanReport = mapStructMapper.DGScanEntityToScanReportEntity(scanEntity);
            List<DGScanResultEntity> dgScanResultEntities = dgScanResultRepository.findByScanEntityId(scanEntity.getId());
            for (DGScanResultEntity scanResult : dgScanResultEntities) {
                if (map.containsKey(scanResult.getAnalysisName())) {
                    String analysisName = map.get(scanResult.getAnalysisName());
                    String analysisType = scanResult.getAnalysisType();
                    Optional<Analytics> columnName = Analytics.getFieldByAnalysisName(analysisName, analysisType);
                    if (columnName.isPresent() && scanResult.getResult() != null)
                        scanReport.setField(columnName.get().getColumnName(), scanResult.getResult());
                }
            }
            InsertOptions a = InsertOptions.builder().withInsertNulls(false).build();
            cassandraTemplate.insert(scanReport, a);
            log.info("Scan merge is : {}", scanEntity.getId());
            // reportRepository.save(scanReport);
        }
        log.info("Digital greens scans merged successfully");
    }
}
