package com.agnext.reporting.scheduler;

import com.agnext.reporting.enums.Frequency;
import com.agnext.reporting.service.impl.ReportGeneratorServiceImpl;
import lombok.AllArgsConstructor;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@AllArgsConstructor
public class Job extends QuartzJobBean {

    public static final long DAYS = 0L;
    private final ReportGeneratorServiceImpl reportGeneratorService;

    @Override
    protected void executeInternal(JobExecutionContext context) {
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
            reportGeneratorService.generateReport(dateTime, LocalDateTime.now(), DAYS, customerId, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
