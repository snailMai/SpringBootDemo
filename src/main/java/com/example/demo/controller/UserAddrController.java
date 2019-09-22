package com.example.demo.controller;

import com.example.demo.setting.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAddrController {
    // test ConfigBean
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/user/addr")
    public String hexo(){
        return configBean.getName() + configBean.getNation() + configBean.getAge();
    }
}
