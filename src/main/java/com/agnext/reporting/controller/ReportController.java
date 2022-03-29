package com.agnext.reporting.controller;

import com.agnext.reporting.service.impl.ReportGeneratorServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
@AllArgsConstructor
public class ReportController {

    private final ReportGeneratorServiceImpl reportGeneratorService;

    @GetMapping("/report")
    public void sendExcelReportBetweenDates(
            @RequestParam(value = "start_date",required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam(value = "end_date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate,
            @RequestParam(value = "days", required = false) Long days, @RequestParam(value = "customer_id") Long customerId)
            throws IOException, NoSuchFieldException, IllegalAccessException, MessagingException,
            ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException {
//        reportGeneratorService.generateReport(startDate, endDate, days, customerId);
    }

}
