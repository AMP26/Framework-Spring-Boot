package com.springboot.beanscopes.rest;

import com.springboot.beanscopes.paymentmethods.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutRestController {
    Payment payment;
    Payment newPayment;

    @Autowired
    public CheckoutRestController(@Qualifier("creditcard") Payment payment, @Qualifier("creditcard") Payment newPayment) {
        this.payment = payment;
        this.newPayment = newPayment;
    }

    @GetMapping("/checkout")
    public String payment() { return payment.pay(); }

    @GetMapping("/check")
    public String beanScope() {
        return "payment == newPayment? " + (payment == newPayment);
    }
}
