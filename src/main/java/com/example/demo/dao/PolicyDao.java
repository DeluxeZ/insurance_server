package com.example.demo.dao;

import com.example.demo.model.Policy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PolicyDao {

    Policy selectByPid(@Param("pid") String pid);

}
