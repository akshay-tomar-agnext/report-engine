package com.agnext.reporting.controller;

import com.agnext.reporting.configuration.analytics.SchedulingDetails;
import com.agnext.reporting.scheduler.SchedulerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class SchedulerController {

    private final SchedulerService schedulerService;
    private final SchedulingDetails schedulingDetails;

    public SchedulerController(SchedulerService schedulerService, SchedulingDetails schedulingDetails) {
        this.schedulerService = schedulerService;
        this.schedulingDetails = schedulingDetails;
    }

//    @PostMapping("/schedule")
//    public void schedule(@RequestBody JobDataModel jobDataModel){
////        Map<String, CredentialModel> customers =  schedulingDetails.getCustomers();
////        for (Map.Entry<String, CredentialModel> entry : customers.entrySet())
////             schedulerService.schedule(entry.getKey(),entry.getValue());
////        System.out.println(customers);
////        schedulerService.schedule(jobDataModel);
//
//    }
}
