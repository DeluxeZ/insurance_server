package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("getInfo")
@CrossOrigin
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @PostMapping("customer")
    public Customer selectByPid(String idCard){
        Customer customer = customerService.selectById(idCard);
        return customer;
    }
}
