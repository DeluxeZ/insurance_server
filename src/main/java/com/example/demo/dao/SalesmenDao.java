package com.example.demo.dao;

import com.example.demo.model.Salesmen;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SalesmenDao {

    Salesmen selectByJobNumber(@Param("jobNumber") String jobNumber);

    List<Salesmen> selectAll();

    int renewInfo(@Param("jobNumber") String jobNumber, @Param("sname") String sname, @Param("gender") String gender, @Param("phone") String phone);

    int deleteByJobNumber(@Param("jobNumber") String jobNumber);

    int insert(@Param("jobNumber") String jobNumber, @Param("idCard") String idCard, @Param("sname") String sname,
               @Param("phone") String phone, @Param("gender") String gender, @Param("password") String password);
}
