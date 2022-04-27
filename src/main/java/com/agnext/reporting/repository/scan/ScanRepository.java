package com.agnext.reporting.repository.scan;

import com.agnext.reporting.entity.dg.DGScanEntity;
import com.agnext.reporting.entity.scan.ScanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScanRepository extends JpaRepository<ScanEntity, Long> {


    List<ScanEntity> findByCustomerIdAndIdGreaterThanAndIsValid(Long customerId, Long id, Boolean isValid);

    @Query(value = "Select * from scm_scans s WHERE s.company_id = :id AND s.is_valid = true ORDER BY id ASC LIMIT 1",nativeQuery = true)
    ScanEntity findTopByCustomerIdAndIdOrderByIdAsc(Long id);
}
