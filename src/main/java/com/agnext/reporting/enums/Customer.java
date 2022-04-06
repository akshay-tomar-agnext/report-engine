package com.agnext.reporting.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Customer {
    KCS(213L),
    MCS(000L);

    private final Long code;
}
