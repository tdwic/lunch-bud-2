package com.example.dd.controller;

import com.example.dd.services.SmsNotificationService;
import com.example.dd.services.twilioService.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sms")
public class NotificationController {
    private final SmsNotificationService smsNotificationService;

    @Autowired
    public NotificationController(SmsNotificationService smsNotificationService) {
        this.smsNotificationService = smsNotificationService;
    }

    @PostMapping
    public String sendSms(@RequestBody SmsRequest smsRequest) {
        return smsNotificationService.sendSms(smsRequest);
    }
}
