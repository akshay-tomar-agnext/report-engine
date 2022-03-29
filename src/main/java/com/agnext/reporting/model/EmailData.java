package com.agnext.reporting.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmailData {
    @JsonProperty("email_id")
    private Long emailId;
    @JsonProperty("email_sender")
    private String emailSender;
    @JsonProperty("email_to_recipient")
    private String[] emailToRecipient;
    @JsonProperty("email_cc_recipients")
    private String[] emailCcRecipients;
    @JsonProperty("email_bcc_recipients")
    private String[] emailBccRecipients;
    @JsonProperty("email_subject")
    private String emailSubject;
    @JsonProperty("email_content")
    private String emailContent;
    @JsonProperty("email_content_type")
    private String contentType;
}
