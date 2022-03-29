package com.agnext.reporting.model;

import com.agnext.notification.lib.vo.EmailData;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NotificationData {
    @JsonProperty("notification_type_id")
    private Integer notificationTypeId;
    @JsonProperty("email")
    private EmailData email;

}
