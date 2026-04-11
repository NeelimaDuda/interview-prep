package org.neelima.example;

import org.neelima.example.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main{
    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");


        OrderService orderService = (OrderService) context.getBean("orderService");
        orderService.calculate();
    }
}