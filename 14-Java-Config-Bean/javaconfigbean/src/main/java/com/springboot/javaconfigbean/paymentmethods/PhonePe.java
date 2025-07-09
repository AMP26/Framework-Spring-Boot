package com.springboot.javaconfigbean.paymentmethods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("phonepe")
public class PhonePe implements Payment {
    public String pay() {
        return "PhonePePayment.";
    }
}
