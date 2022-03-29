package com.agnext.reporting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NotificationData {
    private Integer notificationTypeId;
    private EmailData email;
}
