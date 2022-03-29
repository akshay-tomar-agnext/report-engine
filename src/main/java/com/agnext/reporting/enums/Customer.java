package com.agnext.reporting.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Customer {
    KCS(220L),
    MCS(212L);

    private final Long code;
}
