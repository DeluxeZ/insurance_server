package com.example.demo.service;

import com.example.demo.model.Salesmen;

import java.util.List;

public interface SalesmenService {

    Salesmen selectByJobNumber(String jobNumber);

    List<Salesmen> selectAll();

    int renewInfo(String jobNumber, String sname, String gender, String phone);

    int deleteByJobNumber(String jobNumber);

    int insert(String jobNumber, String idCard, String sname, String phone, String gender, String password);
}
