package com.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.RoleService;
import com.springboot.service.UserService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/getAllRole")
	public List<Map> getAllRole(){
		System.out.println("用户信息:"+userService.getAllUser());
		System.out.println("角色信息:"+roleService.getAllRole());
		return roleService.getAllRole();
	}
	
	/*
	 * @RequestMapping("/getAllUser") public List<Map> getAllUser(){ return
	 * userService.getAllUser(); }
	 */
}
