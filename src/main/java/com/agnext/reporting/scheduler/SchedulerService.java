package com.agnext.reporting.scheduler;

import com.agnext.reporting.model.CredentialModel;
import lombok.AllArgsConstructor;
import org.quartz.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@AllArgsConstructor
public class SchedulerService {

    private final Scheduler quartzScheduler;

    @PostConstruct
    public void start() {
        try {
            quartzScheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void destroy() {
        try {
            quartzScheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public void schedule(String customerName, CredentialModel credentialModel) {

        String jobGroup = "JG1";
        JobDataMap map = new JobDataMap();
        map.put("Customer", customerName);
        map.put("CustomerId", credentialModel.getCustomerId());
        map.put("Frequency", credentialModel.getFrequency());
        map.put("Emails", credentialModel.getEmails());

        JobDetail jobDetail = JobBuilder.newJob(Job.class)
                .withIdentity(customerName, jobGroup).usingJobData(map).build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity(customerName, jobGroup)
                .withSchedule(CronScheduleBuilder.cronSchedule(credentialModel.getCronExpression())).build();

        try {
            quartzScheduler.scheduleJob(jobDetail, trigger);
            System.out.println("Job Schedule");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
