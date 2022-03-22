package com.agnext.reporting.enums;

import com.agnext.reporting.Constants;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public enum AssayingTypeEnum {
    COMPOSITE(Constants.SCAN_TYPE_COMPOSITE),
    INDIVIDUAL(Constants.SCAN_TYPE_INDIVIDUAL),
    PERIPHERAL(Constants.SCAN_TYPE_PERIPHERAL),
    COMPOSITE_INBOUND(Constants.SCAN_TYPE_COMPOSITE_INBOUND),
    STORAGE(Constants.SCAN_TYPE_STORAGE),
    OUTBOUND(Constants.SCAN_TYPE_OUTBOUND);

    private String scanType;

    AssayingTypeEnum(String scanType) {
        this.scanType = scanType;
    }

    public static AssayingTypeEnum getEnumFromType(String scanType) {
        AssayingTypeEnum assayingTypeEnum = Arrays.stream(AssayingTypeEnum.values())
                .filter(enumType -> StringUtils.equalsIgnoreCase(enumType.scanType, scanType))
                .findFirst()
                .orElseThrow(
                        () -> new IllegalStateException(String.format("UnSupported scanType : " + "%s ", scanType)));
        return assayingTypeEnum;
    }

    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    @Override
    public String toString() {
        return "AssayingTypeEnum{" + "scanType='" + scanType + '\'' + '}';
    }
}
