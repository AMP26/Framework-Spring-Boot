package com.springboot.actuatorsecurity.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorSecurityRestController {

    @GetMapping("/")
    public String greet() {
        return "Hello from Spring Boot Actuator";
    }
}
