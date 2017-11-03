package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.entity.User;

public interface UserDao {
    int insert(User record);

    int insertSelective(User record);
    
    User findUserById(Integer id);
    
    List<User> findAll(@Param("offset")int offset,@Param("limit")int limit);
}