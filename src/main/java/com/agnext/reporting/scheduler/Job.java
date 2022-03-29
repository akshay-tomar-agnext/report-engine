package com.agnext.reporting.scheduler;

import com.agnext.reporting.enums.Frequency;
import com.agnext.reporting.service.impl.ReportGeneratorServiceImpl;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Job extends QuartzJobBean {

    private final ReportGeneratorServiceImpl reportGeneratorService;

    public Job(ReportGeneratorServiceImpl reportGeneratorService) {
        this.reportGeneratorService = reportGeneratorService;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getMergedJobDataMap();
        String frequency = jobDataMap.getString("Frequency");
        Long customerId = jobDataMap.getLong("CustomerId");
        String[] email = (String[]) jobDataMap.get("Emails");

        LocalDateTime dateTime = null;
        if (frequency.equalsIgnoreCase(Frequency.DAILY.getTime())) {
            dateTime = LocalDateTime.now().minusDays(1);
        } else if (frequency.equalsIgnoreCase(Frequency.WEEKLY.getTime())) {
            dateTime = LocalDateTime.now().minusWeeks(1);
        } else if (frequency.equalsIgnoreCase(Frequency.MONTHLY.getTime())) {
            dateTime = LocalDateTime.now().minusMonths(1);
        }

        try {
            reportGeneratorService.generateReport(dateTime, LocalDateTime.now(), 0L, customerId, email);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
