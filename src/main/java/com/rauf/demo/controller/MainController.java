package com.rauf.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello() {

        return "Hello, everyone!";
    }

    @GetMapping("/user")
    public String user() {

        return "Hello, user!";
    }

    @GetMapping("/admin")
    public String admin() {

        return "Hello, admin!";
    }
}
