package com.springboot.primary.paymentmethods;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PhonePe implements Payment {
    public String pay() { return "PhonePe Payment."; }
}
