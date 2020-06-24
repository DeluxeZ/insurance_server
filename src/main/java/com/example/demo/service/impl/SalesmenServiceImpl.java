package com.example.demo.service.impl;

import com.example.demo.dao.SalesmenDao;
import com.example.demo.model.Salesmen;
import com.example.demo.service.SalesmenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalesmenServiceImpl implements SalesmenService {

    @Resource
    private SalesmenDao salesmenDao;

    @Override
    public Salesmen selectByJobNumber(String jobNumber) {
        Salesmen salesmen = salesmenDao.selectByJobNumber(jobNumber);
        return salesmen;
    }

    @Override
    public List<Salesmen> selectAll() {
        List<Salesmen> salesmen = salesmenDao.selectAll();
        return salesmen;
    }
}
