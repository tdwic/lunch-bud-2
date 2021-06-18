package com.example.dd;

import com.example.dd.Utils.AES;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DdApplication {

    public static void main(String[] args) {

        SpringApplication.run(DdApplication.class, args);

//        final String secretKey = "tdwicEncrypSecretCode";
//        String originalString = "+12566485083";
//        String encryptedString = AES.encrypt(originalString, secretKey) ;
//        String decryptedAccountSid = AES.decrypt(encryptedString, secretKey) ;
//        System.out.println(originalString);
//        System.out.println(encryptedString);
//        System.out.println(decryptedAccountSid);
    }

}
