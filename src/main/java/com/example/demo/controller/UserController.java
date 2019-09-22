package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    // test application.properties
    @Value("${com.demo.id}")
    private String id;
    @Value("${com.demo.name}")
    private String name;
    @Value("${com.demo.want}")
    private String want;

    @RequestMapping("/user")
    public String hexo(){
        return "id是" + id + "\n" + name + "," + want;
    }
}
