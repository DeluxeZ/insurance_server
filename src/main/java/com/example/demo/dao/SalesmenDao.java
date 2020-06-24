package com.example.demo.dao;

import com.example.demo.model.Salesmen;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SalesmenDao {

    Salesmen selectByJobNumber(@Param("jobNumber") String jobNumber);

    List<Salesmen> selectAll();
}
