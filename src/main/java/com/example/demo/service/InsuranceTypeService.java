package com.example.demo.service;

import com.example.demo.model.InsuranceType;

import java.util.List;

public interface InsuranceTypeService {

    InsuranceType selectById(int id);

    List<InsuranceType> selectAll();
}
