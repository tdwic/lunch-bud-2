package com.example.dd.controller;

import com.example.dd.services.Service;
import com.example.dd.services.twilioService.SmsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sms")
public class NotificationController {
    private final Service service;

    @Autowired
    public NotificationController(Service service) {
        this.service = service;
    }

    @PostMapping
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        service.sendSms(smsRequest);
    }
}
