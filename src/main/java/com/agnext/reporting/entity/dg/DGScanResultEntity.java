package com.agnext.reporting.entity.dg;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "scm_scan_results")
public class DGScanResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "analysis_name")
    private String analysisName;

    @Column(name = "analysis_code")
    private String analysisCode;

    @Column(name = "analysis_type")
    private String analysisType;

    @Column(name = "result")
    private String result;

    @ManyToOne
    @JoinColumn(name = "scan_id")
    private DGScanEntity scanEntity;

    @Column(name = "lab_result")
    private Double labResult;
}
