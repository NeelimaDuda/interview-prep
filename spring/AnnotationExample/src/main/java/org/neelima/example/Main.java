package org.neelima.example;

import org.neelima.example.config.AppConfig;

import org.neelima.example.controller.PaymentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentController pc=context.getBean(PaymentController.class);
        pc.payment(200);



    }
}