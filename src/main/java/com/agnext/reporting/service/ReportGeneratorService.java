package com.agnext.reporting.service;

import javax.mail.MessagingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;

public interface ReportGeneratorService {
    void generateReport(LocalDateTime startDate, LocalDateTime endDate, Long days, Long customerId, String[] emails)
            throws IOException, NoSuchFieldException, IllegalAccessException, MessagingException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException;
}
