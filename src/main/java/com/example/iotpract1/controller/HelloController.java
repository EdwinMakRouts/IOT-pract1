package com.example.iotpract1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello") //Endpoint: GET /api/hello
    public String hello() {
        return "Hello World";
    }
}
