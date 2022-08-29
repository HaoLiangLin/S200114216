package com.gdsdxy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {
    @GetMapping("/helloworld")
    public String hello() {
        System.out.println("林武泰同学，欢迎学习springboot");
        return "林武泰同学，欢迎学习springboot";
    }
}
