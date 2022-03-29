package com.agnext.reporting.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Commodity {
    RAGI("Ragi"),
    PADDY("Paddy"),
    JOWR("Jowr");

    private final String name;
}
