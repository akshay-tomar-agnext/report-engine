package com.agnext.reporting.service;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public interface ReportGeneratorService {

    void generateReport(LocalDate startDate, LocalDate endDate, Long days, Long customerId)
            throws IOException, NoSuchFieldException, IllegalAccessException, MessagingException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException;
}
