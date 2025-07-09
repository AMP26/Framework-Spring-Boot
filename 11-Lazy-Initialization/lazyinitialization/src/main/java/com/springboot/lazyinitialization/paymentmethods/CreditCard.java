package com.springboot.lazyinitialization.paymentmethods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("creditcard")
public class CreditCard implements Payment {

    public CreditCard() { System.out.println("CreditCard Constructor"); }
    public String pay() { return "CreditCard Payment."; }
}
