package com.example.demo.service;

import com.example.demo.model.Salesmen;

import java.util.List;

public interface SalesmenService {

    Salesmen selectByJobNumber(String jobNumber);

    List<Salesmen> selectAll();
}
