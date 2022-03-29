package com.agnext.reporting.configuration.analytics;

import com.agnext.reporting.model.CredentialModel;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "details")
public class SchedulingDetails {
    private Map<String, CredentialModel> customers;

    public Map<String, CredentialModel> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<String, CredentialModel> customers) {
        this.customers = customers;
    }

}
