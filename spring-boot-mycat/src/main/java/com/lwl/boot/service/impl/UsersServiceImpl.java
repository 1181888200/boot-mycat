package com.lwl.boot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwl.boot.mapper.UsersMapper;
import com.lwl.boot.model.Users;
import com.lwl.boot.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;
	
	@Override
	public void add(Users u) {
		usersMapper.add(u);
	}

	@Override
	public List<Users> find() {
		return usersMapper.find();
	}

	
	
	
	
}
