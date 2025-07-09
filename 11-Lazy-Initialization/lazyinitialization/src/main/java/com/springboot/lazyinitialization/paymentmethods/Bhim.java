package com.springboot.lazyinitialization.paymentmethods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bhim")
// @Lazy - Not recommended
public class Bhim implements Payment {

    public Bhim() { System.out.println("BHIM Constructor"); }
    @Override
    public String pay() { return "BHIM Payment."; }
}
