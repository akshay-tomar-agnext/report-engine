package com.agnext.reporting.repository.scan;

import com.agnext.reporting.entity.scan.ScanResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScanResultRepository extends JpaRepository<ScanResultEntity,String> {
    List<ScanResultEntity> findByScanEntityId(Long scanId);
}
