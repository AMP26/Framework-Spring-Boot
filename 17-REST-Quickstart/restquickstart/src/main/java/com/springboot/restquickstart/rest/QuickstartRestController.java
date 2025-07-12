package com.springboot.restquickstart.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quickstart")
public class QuickstartRestController {

    @GetMapping("/greet")
    public String greetEveryone() { return "Hello Everyone!"; }
}
