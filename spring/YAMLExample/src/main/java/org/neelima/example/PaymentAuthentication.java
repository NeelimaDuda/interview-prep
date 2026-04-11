package org.neelima.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentAuthentication {

    @Value("${payment.username}")
    private String username;

    @Value("${payment.password}")
    private String password;

    public void process() {
        System.out.println("User: " + username);
        System.out.println("Password: " + password);


    }
}
