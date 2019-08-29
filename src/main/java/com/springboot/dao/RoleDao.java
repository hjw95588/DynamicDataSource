package com.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springboot.entity.User;

@Mapper
public interface RoleDao {
    //使用xml配置形式查询
    public List<Map> getAllRole();
    public int addRole(User user);
}
