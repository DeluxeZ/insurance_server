package com.example.demo.service;

import com.example.demo.model.InsuranceType;

import java.rmi.ServerException;

public interface InsuranceTypeService {

    InsuranceType selectById(int id);

}
