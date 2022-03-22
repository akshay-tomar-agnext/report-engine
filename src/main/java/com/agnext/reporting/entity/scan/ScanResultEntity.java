package com.agnext.reporting.entity.scan;

import com.agnext.reporting.entity.scan.ScanEntity;
import com.agnext.reporting.enums.InferenceTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "scm_scan_results")
public class ScanResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "analysis_name")
    private String analysisName;

    @Column(name = "analysis_code")
    private String analysisCode;

    @Column(name = "result")
    private String result;

    @ManyToOne
    @JoinColumn(name = "scan_id")
    private ScanEntity scanEntity;

    @Column(name = "lab_result")
    private Double labResult;

    @Column(name = "analysis_type")
    private String analysisType = InferenceTypeEnum.MANUAL.getInferenceType();
}
