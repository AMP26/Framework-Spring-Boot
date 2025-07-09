package com.springboot.beanlifecyclemethods.paymentmethods;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("creditcard")
public class CreditCard implements Payment {
    public String pay() {
        return "Credit Card Payment.";
    }

    @PostConstruct
    public void doInitialization() {
        System.out.println("doInitialization Method Executed: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanup() {
        System.out.println("doCleanup Method Executed: " + getClass().getSimpleName());
    }
}
