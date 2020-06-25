package com.example.demo.dao;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Policy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PolicyDao {

    Policy selectByPid(@Param("pid") String pid);

    List<Policy> selectByStatus(@Param("idCard") String idCard, @Param("status") int status);

    List<Policy> selectAll(@Param("idCard") String idCard, @Param("status") int status);

    int updateStatus(@Param("pid") String pid, @Param("status") int status);

    int insertPolicy(@Param("policy")Policy policy);

    List<Policy> selectByJobNumber(@Param("jobNumber") String jobNumber, @Param("status") int status);

    List<Policy> selectAllByJob(@Param("jobNumber") String jobNumber);

    List<Policy> select();
}
