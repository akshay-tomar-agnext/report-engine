package com.agnext.reporting.service.impl;

import com.agnext.notification.lib.vo.EmailData;
import com.agnext.reporting.model.NotificationData;
import com.agnext.reporting.service.EmailSenderService;
import lombok.AllArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.time.LocalDate;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

    public static final String URL = "http://23.98.216.140:9456/notification/email";

    @Value("${email.from}")
    private String from;

    @Value("${email.subject}")
    private String subject;

    @Value("${email.content}")
    private String content;

    public void sendEmail(String[] toEmail, ByteArrayInputStream inputStream) {

        NotificationData notificationData = new NotificationData();
        EmailData emailData = new EmailData();
        try {
            RestTemplate restTemplate = new RestTemplate();
            LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
            map.add("files", new FileSystemResource(convertInputStreamToFile(inputStream)));
            emailData.setEmailToRecipient(toEmail);
            emailData.setEmailContent(content);
            emailData.setEmailSender(from);
            emailData.setEmailSubject(subject);

            notificationData.setNotificationTypeId(2);
            notificationData.setEmail(emailData);
            map.add("data", notificationData);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);

            HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<>(map, headers);
            ResponseEntity<String> result = restTemplate.exchange(URL, HttpMethod.POST, requestEntity, String.class);
            System.out.println("Email sent successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    File convertInputStreamToFile(ByteArrayInputStream inputStream) throws IOException {
        File resultFile = new File("scan_report" + LocalDate.now() + ".xlsx");
        FileUtils.copyInputStreamToFile(inputStream, resultFile);
        return resultFile;
    }
}
