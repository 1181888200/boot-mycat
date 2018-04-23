package com.lwl.boot.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.model.Users;
import com.lwl.boot.service.UsersService;

@RestController
public class UserController {

	@Resource
	private UsersService usersService;
	
	@RequestMapping("/user/add")
	public String add(String name) {
		Users u = new Users();
		u.setName(name).setIndate(new Date());
		usersService.add(u);
		return "插入成功";
	}
	
	@RequestMapping("/user/find")
	public List<Users> find() {
		return usersService.find();
	}
	
}
