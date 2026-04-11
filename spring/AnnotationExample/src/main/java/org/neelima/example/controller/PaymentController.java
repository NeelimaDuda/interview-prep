package org.neelima.example.controller;

import org.neelima.example.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PaymentController {

    @Autowired
    @Qualifier("creditCard")
    private PaymentService paymentService;

    public void payment(int amt)
    {
        paymentService.makePayment(amt);
    }
}
