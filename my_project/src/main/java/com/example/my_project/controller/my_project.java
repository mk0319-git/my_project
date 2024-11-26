package com.example.my_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class my_project {

    @GetMapping("/hello")
    public String hello() {
        return "hello, my project!";
    }
}
