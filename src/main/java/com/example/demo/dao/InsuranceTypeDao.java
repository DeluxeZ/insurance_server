package com.example.demo.dao;

import com.example.demo.model.InsuranceType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InsuranceTypeDao {

    InsuranceType selectById(@Param("id") int id);

}
