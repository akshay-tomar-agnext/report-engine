package com.agnext.reporting.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Commodity {
    RAGI("Ragi"),
    PADDY("Paddy"),
    RICE("Rice"),
    JOWAR("Jowar");

    private final String name;
}
