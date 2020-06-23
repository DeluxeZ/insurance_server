package com.example.demo.controller;

import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("policy")
@CrossOrigin
public class PolicyController {

    @Resource
    private PolicyService policyService;

    @PostMapping("query")
    public Policy selectByPid(String pid) {
        Policy policy = policyService.selectByPid(pid);
        return policy;
    }

    @PostMapping("screen")
    public List<Policy> selectByStatus(String idCard, int status){
        List<Policy> policies;
        if (status == 5) {
            policies = policyService.selectAll(idCard, status);
        } else {
            policies = policyService.selectByStatus(idCard, status);
        }
        return policies;
    }

    @PostMapping("sign")
    public int updateStatus(String pid, int status){
        int i = policyService.updateStatus(pid, status + 1);
        return i;
    }
}
