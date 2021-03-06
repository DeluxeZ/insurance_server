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

    @Override
    public int renewInfo(String jobNumber, String sname, String gender, String phone) {
        return salesmenDao.renewInfo(jobNumber, sname, gender, phone);
    }

    @Override
    public int deleteByJobNumber(String jobNumber) {
        return salesmenDao.deleteByJobNumber(jobNumber);
    }

    @Override
    public int insert(String jobNumber, String idCard, String sname, String phone, String gender, String password) {
        return salesmenDao.insert(jobNumber, idCard, sname, phone, gender, password);
    }
}
