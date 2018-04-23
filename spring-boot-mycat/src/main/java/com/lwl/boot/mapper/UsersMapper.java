package com.lwl.boot.mapper;

import java.util.List;

import com.lwl.boot.model.Users;

public interface UsersMapper {

	
	void add(Users u);
	
	List<Users> find();
	
}
