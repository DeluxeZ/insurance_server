package com.example.demo.service;

import com.example.demo.model.Customer;

public interface CustomerService {

    Customer selectById(String idCard);

    int insertCustomer(Customer customer);
}
