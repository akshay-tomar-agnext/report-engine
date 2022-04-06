package com.agnext.reporting;

import com.agnext.reporting.configuration.analytics.SchedulingDetails;
import com.agnext.reporting.model.CredentialModel;
import com.agnext.reporting.scheduler.SchedulerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.scheduling.annotation.EnableScheduling;


import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableScheduling
public class ReportingEngineApplication implements CommandLineRunner {

    private final SchedulerService schedulerService;
    private final SchedulingDetails schedulingDetails;

    public ReportingEngineApplication(SchedulerService schedulerService, SchedulingDetails schedulingDetails) {
        this.schedulerService = schedulerService;
        this.schedulingDetails = schedulingDetails;
    }

    public static void main(String[] args) {
        SpringApplication.run(ReportingEngineApplication.class, args);
    }

    @Bean
    public EntityManagerFactoryBuilder entityManagerFactoryBuilder() {
        return new EntityManagerFactoryBuilder(new HibernateJpaVendorAdapter(), new HashMap<>(), null);
    }

    @Override
    public void run(String... args) {
        Map<String, CredentialModel> customers = schedulingDetails.getCustomers();
        for (Map.Entry<String, CredentialModel> entry : customers.entrySet())
            schedulerService.schedule(entry.getKey(), entry.getValue());
    }
}
