package com.example.demo.dao;

import com.example.demo.model.Salesmen;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SalesmenDao {

    Salesmen selectByJobNumber(@Param("jobNumber") String jobNumber);

}
