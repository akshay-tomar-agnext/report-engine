package com.agnext.reporting.repository.report;

import com.agnext.reporting.entity.report.ScanReportEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScanReportRepository extends CassandraRepository<ScanReportEntity, Long> {

    @Query("Select * from scan_report WHERE company_id = :id  ORDER BY scan_id DESC LIMIT 1")
    ScanReportEntity findTopByOrderByScanIdDesc(String id);
//    List<ScanReportEntity> findByCustomerIdAndCreatedOnBetweenAndIsValidOrderByCreatedOn(String customerId,String startDate,String endDate);

    List<ScanReportEntity> findByCustomerId(String customerId);


}
