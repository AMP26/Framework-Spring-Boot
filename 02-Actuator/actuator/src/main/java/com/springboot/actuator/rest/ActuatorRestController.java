package com.springboot.actuator.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorRestController {

    @Value("${first.name}")
    private String firstName;

    @Value("${last.name}")
    private String lastName;

    @GetMapping("/fullname")
    public String fullName() {
        return "Full Name: " + this.firstName + this.lastName;
    }
}
