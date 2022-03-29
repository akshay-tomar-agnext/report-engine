package com.agnext.reporting.enums;

public enum Frequency {
    DAILY("Daily"), WEEKLY("Weekly"), MONTHLY("Monthly"), YEARLY("Yearly");

    private final String time;

    Frequency(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
