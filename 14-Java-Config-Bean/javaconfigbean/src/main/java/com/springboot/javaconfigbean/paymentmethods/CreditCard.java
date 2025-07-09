package com.springboot.javaconfigbean.paymentmethods;

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
}