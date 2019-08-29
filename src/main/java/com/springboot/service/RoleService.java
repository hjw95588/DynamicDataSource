package com.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.config.DS;
import com.springboot.dao.RoleDao;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;
 
    //使用数据源1查询
   @DS("datasource1")
    public List<Map> getAllRole(){
        return roleDao.getAllRole();
    }
   
}
