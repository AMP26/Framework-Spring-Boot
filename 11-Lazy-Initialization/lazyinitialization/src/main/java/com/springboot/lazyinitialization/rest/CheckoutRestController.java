package com.springboot.lazyinitialization.rest;

import com.springboot.lazyinitialization.paymentmethods.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutRestController {
    private Payment payment;

    @Autowired
    public CheckoutRestController(@Qualifier("bhim") Payment payment) {
        System.out.println("Checkout REST Controller Constructor");
        this.payment = payment;
    }

    @GetMapping("/checkout")
    public String payment() { return payment.pay(); }
}
