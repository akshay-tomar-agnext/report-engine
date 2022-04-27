package com.agnext.reporting.repository.dg;

import com.agnext.reporting.entity.dg.DGScanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DGScanRepository extends JpaRepository<DGScanEntity,Long> {

    DGScanEntity findTopByOrderById();

    List<DGScanEntity> findByIdGreaterThanAndIsValid(Long scanId, boolean b);
}
