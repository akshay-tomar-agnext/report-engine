package com.agnext.reporting.controller;

import com.agnext.reporting.service.impl.DataGenerationServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataGenerationController {

    private final DataGenerationServiceImpl scanReportService;

    public DataGenerationController(DataGenerationServiceImpl scanReportService) {
        this.scanReportService = scanReportService;
    }

    @GetMapping("/generate-report")
    public void generateReport() {
        try {
            scanReportService.dataMigration();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
