package org.neelima.example.service;

import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCard implements PaymentService{

    @Override
    public void makePayment(int amt) {
        System.out.println("Payment done via CC: "+amt);
    }
}
