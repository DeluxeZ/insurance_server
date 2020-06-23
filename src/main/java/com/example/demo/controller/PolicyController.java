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
        return null;
    }
}
