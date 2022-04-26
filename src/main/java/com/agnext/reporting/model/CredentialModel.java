package com.agnext.reporting.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CredentialModel {
    private Long customerId;
    private String frequency;
    private String cronExpression;
    private String from;
    private String subject;
    private String content;
    private String[] emails;
}
