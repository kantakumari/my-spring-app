package com.sapient.hellowworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class heloworld {
    @GetMapping("/hello")
    String hello(){
        return "Hello World from spring-docker";
    }
}