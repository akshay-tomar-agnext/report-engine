package com.agnext.reporting.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScanResultModel {

    @JsonProperty("id")
    private String id;

    @JsonProperty("analysis_name")
    private String analysisName;

    @JsonProperty("analysis_code")
    private String analysisCode;

    @JsonProperty("result")
    private String result;

    @JsonProperty("analysis_type")
    private String analysisType;

    @JsonProperty("scan_id")
    private String scanId;

    @JsonProperty("scan_id")
    private String labResult;
}
