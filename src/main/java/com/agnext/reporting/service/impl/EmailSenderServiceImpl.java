package com.agnext.reporting.service.impl;

import com.agnext.reporting.enums.Constants;
import com.agnext.reporting.model.EmailData;
import com.agnext.reporting.model.NotificationData;
import com.agnext.reporting.service.EmailSenderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
@Slf4j
public class EmailSenderServiceImpl implements EmailSenderService {
    @Value("${url}")
    private String url;

    public void sendEmail(EmailData emailData, ByteArrayInputStream inputStream) {

        log.info("Sending mails");
        NotificationData notificationData = new NotificationData();
        try {
            RestTemplate restTemplate = new RestTemplate();
            LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
            map.add("files", new FileSystemResource(convertInputStreamToFile(inputStream)));
            notificationData.setNotificationTypeId(2);
            notificationData.setEmail(emailData);
            map.add("data", notificationData);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);

            HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<>(map, headers);
            ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
            log.info("Mail sent successfully");
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
