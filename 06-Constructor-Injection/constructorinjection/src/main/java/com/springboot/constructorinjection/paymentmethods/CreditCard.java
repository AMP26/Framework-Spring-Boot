package com.springboot.constructorinjection.paymentmethods;

import org.springframework.stereotype.Component;

@Component
public class CreditCard implements Payment {
    public String pay() { return "CreditCard Payment."; }
}
