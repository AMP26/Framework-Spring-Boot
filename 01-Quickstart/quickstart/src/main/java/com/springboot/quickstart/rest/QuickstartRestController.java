package com.springboot.quickstart.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickstartRestController {

    @GetMapping("/")
    public String greet() {
        return "Hello World!";
    }
}
