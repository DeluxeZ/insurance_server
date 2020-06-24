package com.example.demo.controller;

import com.example.demo.model.Policy;
import com.example.demo.model.Salesmen;
import com.example.demo.service.PolicyService;
import com.example.demo.service.SalesmenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("query")
@CrossOrigin
public class QueryController {

    @Resource
    private SalesmenService salesmenService;

    @Resource
    private PolicyService policyService;

    @PostMapping("salesList")
    public List<Salesmen> selectAll(){
        List<Salesmen> salesmen = salesmenService.selectAll();
        return salesmen;
    }

    @PostMapping("list")
    public List<Policy> selectByJobNumber(String jobNumber, int status) {
        List<Policy> policies;
        if (status == 5) {
            policies = policyService.selectAllByJob(jobNumber);
        } else {
            policies = policyService.selectByJobNumber(jobNumber, status);
        }
        return policies;
    }
}
