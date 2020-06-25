package com.example.demo.controller;

import com.example.demo.service.SalesmenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;

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

    @PostMapping("insert")
    public int insert(String idCard, String sname, String phone, String gender, String password) {
        String str = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 11; i++) {
            int number = random.nextInt(10);
            sb.append(str.charAt(number));
        }
        return salesmenService.insert(sb.toString(), idCard, sname, phone, gender, password);
    }
}
