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
import java.util.Arrays;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
@AllArgsConstructor
public class ReportController {

    private final ReportGeneratorServiceImpl reportGeneratorService;

    @GetMapping("/report")
    public void sendExcelReportBetweenDates()
            throws IOException, NoSuchFieldException, IllegalAccessException, MessagingException,
            ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException {
//        reportGeneratorService.generateReport(LocalDate.now().minusMonths(4), LocalDate.now(), 0L, 212L, new String[]{"akshay.tomar@agnext.in"});
    }

}
