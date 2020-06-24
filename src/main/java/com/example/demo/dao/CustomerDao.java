package com.example.demo.dao;

import com.example.demo.model.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerDao {

    Customer selectById(@Param("idCard") String idCard);

    int insertCustomer(@Param("customer") Customer customer);

    int updateInfo(@Param("idCard") String idCard, @Param("name") String name, @Param("gender") String gender, @Param("phone") String phone);
}
