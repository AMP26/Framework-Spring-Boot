package com.springboot.javaconfigbean.paymentmethods;


public class PayPal implements Payment {

    public PayPal() {
        System.out.println("Constructor: " + getClass().getName());
    }
    @Override
    public String pay() {
        return "PayPal Payment.";
    }
}
