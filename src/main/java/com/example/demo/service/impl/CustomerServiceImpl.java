package com.example.demo.service.impl;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Override
    public Customer selectById(String idCard) {
        Customer customer = customerDao.selectById(idCard);
        if (customer == null){
            return null;
        } else {
            return customer;
        }
    }

    @Override
    public int insertCustomer(Customer customer) {
        return customerDao.insertCustomer(customer);
    }
}
