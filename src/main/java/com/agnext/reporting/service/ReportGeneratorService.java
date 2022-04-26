package com.agnext.reporting.service;

import com.agnext.reporting.model.EmailData;

import javax.mail.MessagingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public interface ReportGeneratorService {
    void generateReport(LocalDate startDate, LocalDate endDate, Long days, Long customerId, EmailData emailData)
            throws IOException, NoSuchFieldException, IllegalAccessException, MessagingException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException;
}
