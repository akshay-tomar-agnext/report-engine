package com.agnext.reporting.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

@Getter
public enum InferenceTypeEnum {

    MANUAL("MANUAL", "manualResult"),
    VISIO_DENSITY("VISIO_DENSITY", "aiResultWeight"),
    VISIO_COUNT("VISIO_COUNT", "aiResultCount");

    InferenceTypeEnum(String inferenceType, String displayString) {
        this.inferenceType = inferenceType;
        this.displayString = displayString;
    }

    private String inferenceType;
    private String displayString;


    public static String getDisplayFromInferenceType(String inferenceType){
        InferenceTypeEnum displayInferenceRef = Arrays.stream(InferenceTypeEnum.values())
                .filter(inferenceTypeEnum -> StringUtils.equalsIgnoreCase(inferenceTypeEnum.getInferenceType(),
                        inferenceType)).findFirst().orElse(null);
        if(displayInferenceRef == null){
            return null;
        }
        return displayInferenceRef.displayString;
    }
}
