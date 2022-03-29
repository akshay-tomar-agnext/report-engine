package com.agnext.reporting.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CredentialModel {
    private Long customerId;
    private String frequency;
    private String cronExpression;
    private String[] emails;



}
