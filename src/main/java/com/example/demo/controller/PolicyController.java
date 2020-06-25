package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

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
    public List<Policy> selectByStatus(String idCard, int status) {
        List<Policy> policies;
        if (status == 5) {
            policies = policyService.selectAll(idCard, status);
        } else {
            policies = policyService.selectByStatus(idCard, status);
        }
        return policies;
    }

    @PostMapping("sign")
    public int updateStatus(String pid, int status) {
        int i = policyService.updateStatus(pid, status + 1);
        return i;
    }

    @PostMapping("purchase")
    public int insertPolicy(String value) {
        JSONObject jsonObject = JSONObject.parseObject(value);
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        jsonObject.put("pid", sb.toString());

        Policy policy = new Policy(jsonObject.getString("pid"),jsonObject.getString("date"),
                jsonObject.getString("hName"),jsonObject.getString("hGender"),
                jsonObject.getString("hBir"),jsonObject.getString("hIdCard"),
                jsonObject.getString("hAddress"),jsonObject.getString("hZipCode"),
                jsonObject.getString("aName"),jsonObject.getString("aGender"),
                jsonObject.getString("aBir"),jsonObject.getString("aIdCard"),
                jsonObject.getString("aAddress"),jsonObject.getString("aZipCode"),
                jsonObject.getInteger("iId"),jsonObject.getString("iName"),
                jsonObject.getString("jobNumber"),jsonObject.getString("sName"),
                jsonObject.getString("sPhone"),jsonObject.getString("bName1"),
                jsonObject.getInteger("bNumber1"),jsonObject.getString("bIdCard1"),
                jsonObject.getString("bName2"),jsonObject.getInteger("bNumber2"),
                jsonObject.getString("bIdCard2"),1);

        int re = policyService.insertPolicy(policy);
        return re;
    }

    @PostMapping("policyList")
    public List<Policy> select() {
        List<Policy> policies = policyService.select();
        return policies;
    }
}
