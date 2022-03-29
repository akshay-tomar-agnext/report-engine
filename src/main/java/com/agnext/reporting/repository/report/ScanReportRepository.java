package com.agnext.reporting.repository.report;

import com.agnext.reporting.entity.report.ScanReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScanReportRepository extends JpaRepository<ScanReportEntity, Long> {

    ScanReportEntity findTopByOrderByScanIdDesc();

    List<ScanReportEntity> findByCustomerIdAndCreatedOnBetween(String customerId, String startDate, String endDate);
}
