package com.example.demo.service;

import com.example.demo.model.Policy;

import java.util.List;

public interface PolicyService {

    Policy selectByPid(String pid);

    List<Policy> selectByStatus(String idCard, int status);

    List<Policy> selectAll(String idCard, int status);

    int updateStatus(String pid, int status);
}
