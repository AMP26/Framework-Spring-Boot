package com.springboot.primary.paymentmethods;


import org.springframework.stereotype.Component;

@Component
public class Bhim implements Payment {
    @Override
    public String pay() { return "BHIM Payment."; }
}
