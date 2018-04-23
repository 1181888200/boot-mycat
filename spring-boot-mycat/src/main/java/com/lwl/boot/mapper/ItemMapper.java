package com.lwl.boot.mapper;

import java.util.List;

import com.lwl.boot.model.Item;

public interface ItemMapper {

	public void add(Item i);
	
	List<Item> find();
	
}
