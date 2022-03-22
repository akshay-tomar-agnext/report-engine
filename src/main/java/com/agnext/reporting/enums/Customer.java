package com.agnext.reporting.enums;

public enum Customer {
    KCS(220L);

    private final Long code;

    public Long getCode() {
        return code;
    }

    Customer(Long code) {
        this.code = code;
    }
}
