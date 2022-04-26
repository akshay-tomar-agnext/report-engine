package com.agnext.reporting.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.agnext.reporting.adapter.MapStructMapper;
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
    private final MapStructMapper mapStructMapper = Mappers.getMapper(MapStructMapper.class);

    @Autowired
    private CassandraOperations cassandraTemplate;

    @Override
    @Scheduled(fixedDelay = 43200000)
    public void dataMigration() throws NoSuchFieldException, IllegalAccessException {
        log.info("Merging scan and scan results");
        Map<String, String> map = analyticsDetail.getAnalysisNameFromVariations();
        String[] customer = {"212","213"};
        for (String s : customer) {
            ScanReportEntity scanReportEntity = reportRepository.findTopByOrderByScanIdDesc(s);
            List<ScanEntity> scanList;
            if (scanReportEntity == null) {
                ScanEntity scanEntity = scanRepository.findTopByCustomerIdAndIdOrderByIdAsc(Long.parseLong(s));
                scanList = List.of(scanEntity);
            } else {
                scanList = scanRepository.findByCustomerIdAndIdGreaterThanAndIsValid(Long.parseLong(s),scanReportEntity.getScanId(),true);
            }
            saveData(map, scanList);
        }
        log.info("Scans merged successfully");
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
}
