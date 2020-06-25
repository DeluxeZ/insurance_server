package com.example.demo.dao;

import com.example.demo.model.InsuranceType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InsuranceTypeDao {

    InsuranceType selectById(@Param("id") int id);

    List<InsuranceType> selectAll();

    int deleteById(@Param("id") int id);
}
