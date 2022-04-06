package com.agnext.reporting.service.impl;

import com.agnext.reporting.adapter.MapStructMapper;
import com.agnext.reporting.configuration.analytics.AnalyticsDetail;
import com.agnext.reporting.entity.scan.ScanEntity;
import com.agnext.reporting.entity.report.ScanReportEntity;
import com.agnext.reporting.entity.scan.ScanResultEntity;
import com.agnext.reporting.enums.Analytics;
import com.agnext.reporting.repository.report.ScanReportRepository;
import com.agnext.reporting.repository.scan.ScanRepository;
import com.agnext.reporting.repository.scan.ScanResultRepository;
import com.agnext.reporting.service.DataGenerationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@AllArgsConstructor
@Slf4j
public class DataGenerationServiceImpl implements DataGenerationService {

    private final AnalyticsDetail analyticsDetail;
    private final ScanReportRepository reportRepository;
    private final ScanResultRepository scanResultRepository;
    private final ScanRepository scanRepository;
    private final MapStructMapper mapStructMapper = Mappers.getMapper(MapStructMapper.class);

    @Override
    @Scheduled(cron = "0 0/5 * * * ?")
    public void dataMigration() throws NoSuchFieldException, IllegalAccessException {
        log.info("Merging scan and scan results");
        Map<String, String> map = analyticsDetail.getAnalysisNameFromVariations();
        ScanReportEntity scanReportEntity = reportRepository.findTopByOrderByScanIdDesc();
        List<ScanEntity> scanList;
        if (scanReportEntity == null) {
            ScanEntity scanEntity = scanRepository.findTopByOrderByIdAsc();
            scanList = List.of(scanEntity);
        } else {
            scanList = scanRepository.findByIdGreaterThan(scanReportEntity.getScanId());
        }
        for (ScanEntity scanEntity : scanList) {
            ScanReportEntity scanReport = mapStructMapper.ScanEntityToScanReportEntity(scanEntity);
            scanReport.setScanId(scanEntity.getId());
            scanReport.setAssayingType(scanEntity.getAssayingTypeEnum());
            List<ScanResultEntity> scanResultList = scanResultRepository.findByScanEntityId(scanEntity.getId());
            for (ScanResultEntity scanResult : scanResultList) {
                if (map.containsKey(scanResult.getAnalysisName())) {
                    String analysisName = map.get(scanResult.getAnalysisName());
                    String analysisType = scanResult.getAnalysisType();
                    Optional<Analytics> columnName = Analytics.getFieldByAnalysisName(analysisName, analysisType);
                    if (columnName.isPresent() && scanResult.getResult() != null)
                        scanReport.setField(columnName.get().getColumnName(), Double.valueOf(scanResult.getResult()));
                }
            }
            log.info("Scan merge is : {}", scanEntity.getId());
            reportRepository.save(scanReport);
        }
        log.info("Scans merged successfully");
    }
}
