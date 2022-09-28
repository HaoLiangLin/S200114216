package com.gdsdxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping("/index1")
    public String toIndexPage() {
        return "index";
    }
}
