package com.springboot.beanscopes.paymentmethods;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("creditcard")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // By default, bean scope is Singleton. If we comment it out then /check will be true
public class CreditCard implements Payment {
    public String pay() {
        return "Credit Card Payment.";
    }
}
