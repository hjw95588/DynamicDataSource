package com.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springboot.entity.User;

@Mapper
public interface UserDao {
    //使用xml配置形式查询
    public List<Map> getAllUser();
    public int addUser(User user);
}
