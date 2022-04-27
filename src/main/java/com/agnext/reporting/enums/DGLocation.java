package com.agnext.reporting.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum DGLocation {
    KOLITHAD("Kolithad","CH 0001"),
    CHANDRALAPADU("Chandralapadu","MPK 14"),
    GUNTUR("Guntur", "MPK 15"),
    VATSAVAI("Vatsavai","MPK 13");

    private final String name;
    private final String code;
}
