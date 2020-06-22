package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Customer;
import com.example.demo.model.Salesmen;
import com.example.demo.service.CustomerService;
import com.example.demo.service.SalesmenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("login")
@CrossOrigin
public class LoginController {

    @Resource
    private CustomerService customerService;

    @PostMapping("customer")
    public JSONObject selectById(String idCard, String password) {
        Customer customer = customerService.selectById(idCard);
        JSONObject object = new JSONObject();
        if (customer == null) {
            object.put("status", "10000");
            object.put("data", null);
        } else {
            if (customer.getPassword().equals(password)){
                object.put("status", "10001");
                object.put("data", customer);
            } else {
                object.put("status", "10002");
                object.put("data", null);
            }
        }
        return object;
    }

    @Resource
    private SalesmenService salesmenService;

    @PostMapping("salesmen")
    public JSONObject selectByJobNumber(String jobNumber, String password) {
        JSONObject object = new JSONObject();
        Salesmen salesmen = salesmenService.selectByJobNumber(jobNumber);
        if (salesmen == null) {
            object.put("status", "10000");
            object.put("data", null);
        } else {
            if (salesmen.getPassword().equals(password)){
                object.put("status", "10001");
                object.put("data", salesmen);
            } else {
                object.put("status", "10002");
                object.put("data", null);
            }
        }
        return object;
    }

    @PostMapping("admin")
    public int adminLogin(String account, String password) {
        if (account.equals("admin") && password.equals("6666")) {
            return 1;
        } else {
            return 0;
        }
    }

}
