package com.example.demo.controller;

import com.example.demo.model.InsuranceType;
import com.example.demo.service.InsuranceTypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("insurance")
@CrossOrigin
public class InsuranceTypeController {
    @Resource
    private InsuranceTypeService insuranceTypeService;

    @PostMapping("getIn")
    public InsuranceType selectById(int id) {
        InsuranceType insuranceType = insuranceTypeService.selectById(id);
        if (insuranceType == null) {
            return null;
        } else {
            return insuranceType;
        }
    }
}
