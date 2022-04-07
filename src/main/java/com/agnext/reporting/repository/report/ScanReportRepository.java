package com.agnext.reporting.repository.report;

import com.agnext.reporting.entity.report.ScanReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScanReportRepository extends JpaRepository<ScanReportEntity, Long> {

    ScanReportEntity findTopByOrderByScanIdDesc();

    @Query(value = "Select * from scan_report s where s.company_id = :customerId  and (s.created_on >= :startDate and s.created_on <= :endDate) and s.is_valid = 1",nativeQuery = true)
    List<ScanReportEntity> findByCustomerIdAndCreatedOnBetweenAndIsValidOrderByCreatedOn(@Param("customerId") String customerId,@Param("startDate") String startDate,@Param("endDate") String endDate);


}
