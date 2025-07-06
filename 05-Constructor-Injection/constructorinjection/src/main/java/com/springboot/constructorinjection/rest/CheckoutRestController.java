package com.springboot.constructorinjection.rest;

import com.springboot.constructorinjection.paymentmethods.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutRestController {

    private Payment payment;

    @Autowired
    public CheckoutRestController(Payment payment) { this.payment = payment; }

    @GetMapping("/checkout")
    public String payment() {
        return payment.pay();
    }
}
