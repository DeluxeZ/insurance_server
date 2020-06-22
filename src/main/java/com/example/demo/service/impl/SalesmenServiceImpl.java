package com.example.demo.service.impl;

import com.example.demo.dao.SalesmenDao;
import com.example.demo.model.Salesmen;
import com.example.demo.service.SalesmenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SalesmenServiceImpl implements SalesmenService {

    @Resource
    private SalesmenDao salesmenDao;

    @Override
    public Salesmen selectByJobNumber(String jobNumber) {
        Salesmen salesmen = salesmenDao.selectByJobNumber(jobNumber);
        return salesmen;
    }
}
