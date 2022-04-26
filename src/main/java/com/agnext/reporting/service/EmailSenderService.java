package com.agnext.reporting.service;

import com.agnext.reporting.model.EmailData;

import javax.mail.MessagingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public interface EmailSenderService {
    void sendEmail(EmailData emailData, ByteArrayInputStream inputStream) throws MessagingException, IOException;
}
