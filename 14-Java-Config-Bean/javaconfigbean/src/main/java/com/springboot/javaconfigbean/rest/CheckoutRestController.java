package com.springboot.javaconfigbean.rest;

import com.springboot.javaconfigbean.paymentmethods.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutRestController {
    Payment payment;

    @Autowired
    public CheckoutRestController(@Qualifier("paypal") Payment payment) {
        this.payment = payment;
    }

    @GetMapping("/checkout")
    public String payment() { return payment.pay(); }
}
