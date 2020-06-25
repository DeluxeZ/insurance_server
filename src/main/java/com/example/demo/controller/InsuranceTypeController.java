package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.InsuranceType;
import com.example.demo.service.InsuranceTypeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @PostMapping("getInAll")
    public List<InsuranceType> selectAll(){
        List<InsuranceType> insuranceTypes = insuranceTypeService.selectAll();
        return insuranceTypes;
    }

    @PostMapping("delete")
    public int deleteBuId(int id) {
        int re = insuranceTypeService.deleteById(id);
        return re;
    }

    @PostMapping("insert")
    public int insert(String data) {
        JSONObject jsonObject = JSONObject.parseObject(data);
        InsuranceType insuranceType = new InsuranceType(0, jsonObject.getString("iname"), jsonObject.getString("ageStart"),
                jsonObject.getString("ageEnd"), jsonObject.getString("benefit"), jsonObject.getString("payment"),
                jsonObject.getInteger("premium"), jsonObject.getString("advantage"));
        int re = insuranceTypeService.insert(insuranceType);
        return re;
    }
}
