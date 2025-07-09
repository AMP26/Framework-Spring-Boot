package com.springboot.beanscopes.paymentmethods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bhim")
public class Bhim implements Payment {
    @Override
    public String pay() {
        return "BHIM Payment.";
    }
}
