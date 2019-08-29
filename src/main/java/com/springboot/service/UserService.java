package com.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.config.DS;
import com.springboot.dao.UserDao;
import com.springboot.entity.User;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
 
    //使用数据源2查询
   @DS("datasource2")
   public List<Map> getAllUser(){
        return userDao.getAllUser();
    }
   
 
    
}
