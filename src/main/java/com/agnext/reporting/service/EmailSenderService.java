package com.agnext.reporting.service;

import javax.mail.MessagingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public interface EmailSenderService {
    void sendEmail(String[] toEmail, ByteArrayInputStream inputStream) throws MessagingException, IOException;
}
