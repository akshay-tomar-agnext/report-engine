package com.agnext.reporting.repository.dg;

import com.agnext.reporting.entity.dg.DGScanResultEntity;
import com.agnext.reporting.entity.scan.ScanResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DGScanResultRepository extends JpaRepository<DGScanResultEntity,Long> {

    List<DGScanResultEntity> findByScanEntityId(Long id);
}
