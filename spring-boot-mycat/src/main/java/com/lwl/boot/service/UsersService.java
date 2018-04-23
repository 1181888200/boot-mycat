package com.lwl.boot.service;

import java.util.List;

import com.lwl.boot.model.Users;

public interface UsersService {

	public void add(Users u);
	
	List<Users> find();
	
}
