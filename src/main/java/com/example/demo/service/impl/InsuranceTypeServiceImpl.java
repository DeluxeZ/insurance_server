package com.example.demo.service.impl;

import com.example.demo.dao.InsuranceTypeDao;
import com.example.demo.model.InsuranceType;
import com.example.demo.service.InsuranceTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InsuranceTypeServiceImpl implements InsuranceTypeService {

    @Resource
    private InsuranceTypeDao insuranceTypeDao;

    @Override
    public InsuranceType selectById(int id) {
        InsuranceType insuranceType = insuranceTypeDao.selectById(id);
//        if (insuranceType == null) {
//            throw new ServerException("暂无该保险");
//        }
        return insuranceType;
    }
}
