package com.example.dd.services.twilioService;

import com.example.dd.Utils.AES;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfiguration {

    private String accountSid;
    private String authToken;
    private String trialNumber;

    public TwilioConfiguration() {
    }

    public String getAccountSid() {
        return AES.decrypt(accountSid, "tdwicEncrypSecretCode");
    }
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }


    public String getAuthToken() {
        return AES.decrypt(authToken, "tdwicEncrypSecretCode");
    }
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }


    public String getTrialNumber() {
        return AES.decrypt(trialNumber, "tdwicEncrypSecretCode");
    }
    public void setTrialNumber(String trialNumber) {
        this.trialNumber = trialNumber;
    }
}
