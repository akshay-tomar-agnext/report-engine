package com.agnext.reporting.configuration.analytics;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "analyticsconfig")
public class AnalyticsDetail {

    private Map<String, List<String>> analytics;

    public Map<String, List<String>> getAnalytics() {
        return analytics;
    }

    public void setAnalytics(Map<String, List<String>> analytics) {
        this.analytics = analytics;
    }

    public Map<String, String> getAnalysisNameFromVariations() {
        Map<String, String> returnMap = new HashMap<>();
        getAnalytics().entrySet().stream().forEach(entry -> {
            List<String> variations = entry.getValue();
            variations.stream().forEach(variation -> {
                returnMap.put(variation, entry.getKey());
            });
        });
        return returnMap;
    }
}
