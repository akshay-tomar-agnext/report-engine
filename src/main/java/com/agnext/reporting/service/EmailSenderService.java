package com.agnext.reporting.service;

import javax.mail.MessagingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

public interface EmailSenderService {
    public void sendEmail(String[] toEmail,ByteArrayInputStream inputStream) throws MessagingException, IOException;
}
