package com.agnext.reporting.service.impl;

import com.agnext.reporting.service.EmailSenderService;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.activation.DataSource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.util.ByteArrayDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Date;

@Service
@AllArgsConstructor
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender javaMailSender;

    public void sendEmail(String toEmail, String body, String subject, ByteArrayInputStream inputStream)
            throws MessagingException, IOException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        mimeMessageHelper.setFrom("test@agnext.in");
        mimeMessageHelper.setTo(toEmail);
        mimeMessageHelper.setText(body);
        mimeMessageHelper.setSubject(subject);

        DataSource dataSource = new ByteArrayDataSource(inputStream, "application/xlsx");
        mimeMessageHelper.addAttachment("Scan_report_" + new Date() + ".xlsx", dataSource);
        javaMailSender.send(mimeMessage);
    }
}
