package com.example.demo.service.impl;

import com.example.demo.dao.PolicyDao;
import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Resource
    private PolicyDao policyDao;

    @Override
    public Policy selectByPid(String pid) {
        Policy policy = policyDao.selectByPid(pid);
        return policy;
    }
}
