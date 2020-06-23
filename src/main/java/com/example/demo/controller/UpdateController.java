package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("update")
@CrossOrigin
public class UpdateController {

    @Resource
    private CustomerService customerService;

    @PostMapping("signUp")
    public JSONObject insertCustomer(String idCard, String password, String phone, String birthday, String cname, String gender) {
        JSONObject object = new JSONObject();
        Customer customer = new Customer(idCard, cname, birthday, phone, gender, 1, password);
        int re = customerService.insertCustomer(customer);
        if (re == 1) {
            object.put("status", "10003");
            object.put("data", 1);
        } else {
            object.put("status", "10004");
            object.put("data", 0);
        }
        return object;
    }

}