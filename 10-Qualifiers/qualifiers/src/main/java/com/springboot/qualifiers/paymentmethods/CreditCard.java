package com.springboot.qualifiers.paymentmethods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("creditcard")
public class CreditCard implements Payment {
    public String pay() { return "CreditCard Payment."; }
}
