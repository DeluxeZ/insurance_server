package com.example.demo.controller;

import com.example.demo.service.SalesmenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("sales")
@CrossOrigin
public class SalesmenController {

    @Resource
    private SalesmenService salesmenService;

    @PostMapping("delete")
    public int deleteByJobNumber(String jobNumber) {
        int re = salesmenService.deleteByJobNumber(jobNumber);
        return re;
    }
}
