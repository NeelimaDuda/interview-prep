package org.neelima.example.service;

import org.springframework.stereotype.Service;

@Service("debitCard")
public class DebitCard implements PaymentService{
    @Override
    public void makePayment(int amt) {
        System.out.println("Payment done via DC: "+amt);
    }
}
