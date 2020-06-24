package com.example.demo.service;

import com.example.demo.model.Customer;

public interface CustomerService {

    int updateInfo(String idCard, String name, String gender, String phone);

    Customer selectById(String idCard);

    int insertCustomer(Customer customer);

}
