package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("update")
@CrossOrigin
public class Update {

    @PostMapping("signUp")
    public String insertCustomer(String idCard, String password, String birthday, String cname, String gender){
        return "hello world";
    }

}