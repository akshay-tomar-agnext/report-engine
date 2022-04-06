package com.agnext.reporting.repository.scan;

import com.agnext.reporting.entity.scan.ScanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScanRepository extends JpaRepository<ScanEntity, Long> {

    List<ScanEntity> findByIdGreaterThan(Long id);

    ScanEntity findTopByOrderByIdAsc();
}
