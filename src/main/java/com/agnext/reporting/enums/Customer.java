package com.agnext.reporting.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Customer {
    KCS(213L),
    MCS(212L),
    DIGITAL_GREENS(183L);

    private final Long code;
}
