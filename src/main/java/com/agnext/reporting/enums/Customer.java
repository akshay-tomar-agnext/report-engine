package com.agnext.reporting.enums;

public enum Customer {
    KCS(220L),
    MCS(212L);

    private final Long code;

    public Long getCode() {
        return code;
    }

    Customer(Long code) {
        this.code = code;
    }
}
