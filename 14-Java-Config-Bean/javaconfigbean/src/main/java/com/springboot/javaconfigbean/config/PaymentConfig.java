package com.springboot.javaconfigbean.config;

import com.springboot.javaconfigbean.paymentmethods.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean("paypal") // Bean ID defaults to method name. Here custom Bean ID has been given.
    public Payment payPal() { return new PayPal(); }
}
