package com.springboot.lazyinitialization.paymentmethods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("phonepe")
public class PhonePe implements Payment {
    public PhonePe() { System.out.println("PhonePe Constructor"); }
    public String pay() { return "PhonePe Payment."; }
}
