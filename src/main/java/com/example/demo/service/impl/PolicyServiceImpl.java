package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.PolicyDao;
import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Resource
    private PolicyDao policyDao;

    @Override
    public Policy selectByPid(String pid) {
        Policy policy = policyDao.selectByPid(pid);
        return policy;
    }

    @Override
    public List<Policy> selectByStatus(String idCard, int status) {
        List<Policy> policies = policyDao.selectByStatus(idCard, status);
        return policies;
    }

    @Override
    public List<Policy> selectAll(String idCard, int status) {
        List<Policy> policies = policyDao.selectAll(idCard, status);
        return policies;
    }

    @Override
    public int updateStatus(String pid, int status) {
        return policyDao.updateStatus(pid, status);
    }

    @Override
    public int insertPolicy(Policy policy) {
        return policyDao.insertPolicy(policy);
    }

    @Override
    public List<Policy> selectByJobNumber(String jobNumber, int status) {
        List<Policy> policies = policyDao.selectByJobNumber(jobNumber, status);
        return policies;
    }

    @Override
    public List<Policy> selectAllByJob(String jobNumber) {
        return policyDao.selectAllByJob(jobNumber);
    }

    @Override
    public List<Policy> select() {
        List<Policy> policies = policyDao.select();
        return policies;
    }
}
