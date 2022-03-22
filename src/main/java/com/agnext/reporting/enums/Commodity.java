package com.agnext.reporting.enums;

public enum Commodity {
    RAGI("Ragi"),
    PADDY("Paddy"),
    JOWR("Jowr");

    private final String name;

    Commodity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
