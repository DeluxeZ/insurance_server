package com.example.demo.service;

import com.example.demo.model.Salesmen;

public interface SalesmenService {

    Salesmen selectByJobNumber(String jobNumber);

}
