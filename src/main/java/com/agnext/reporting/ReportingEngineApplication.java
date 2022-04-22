package com.agnext.reporting;

import com.agnext.reporting.configuration.analytics.SchedulingDetails;
import com.agnext.reporting.entity.report.ScanReportEntity;
import com.agnext.reporting.entity.scan.ScanEntity;
import com.agnext.reporting.entity.scan.ScanResultEntity;
import com.agnext.reporting.model.CredentialModel;
import com.agnext.reporting.repository.report.ScanReportRepository;
import com.agnext.reporting.repository.scan.ScanRepository;
import com.agnext.reporting.repository.scan.ScanResultRepository;
import com.agnext.reporting.scheduler.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.scheduling.annotation.EnableScheduling;


import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableScheduling
@EnableCassandraRepositories(basePackageClasses = {ScanReportRepository.class, ScanReportEntity.class})
@EnableJpaRepositories(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { ScanReportRepository.class ,ScanReportEntity.class}) })
public class ReportingEngineApplication implements CommandLineRunner {

    @Autowired
    private SchedulerService schedulerService;

    @Autowired
    private SchedulingDetails schedulingDetails;

    public static void main(String[] args) {
        SpringApplication.run(ReportingEngineApplication.class, args);
    }

    @Override
    public void run(String... args) throws InterruptedException {
        Map<String, CredentialModel> customers = schedulingDetails.getCustomers();
        for (Map.Entry<String, CredentialModel> entry : customers.entrySet())
            schedulerService.schedule(entry.getKey(), entry.getValue());
    }
}
