package com.agnext.reporting.service;

import javax.mail.MessagingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public interface EmailSenderService {
    public void sendEmail(String toEmail, String body, String subject, ByteArrayInputStream inputStream) throws MessagingException, IOException;
}
