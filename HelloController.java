package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired Person person;

    @Value("${spring.application.name}")
    String appName;
    @RequestMapping(value = "/hello")
    public String hello() {
       return "Hello Spring Boot "+person.name+"-"+this.appName;
    }
}
