package com.example.dd.services;

import com.example.dd.services.twilioService.SmsRequest;
import com.example.dd.services.twilioService.SmsSender;
import com.example.dd.services.twilioService.TwilioSmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService {

    private final SmsSender smsSender;

    @Autowired
    public SmsNotificationService(@Qualifier("twilio") TwilioSmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public String sendSms(SmsRequest smsRequest) {
        return smsSender.sendSms(smsRequest);
    }
}
