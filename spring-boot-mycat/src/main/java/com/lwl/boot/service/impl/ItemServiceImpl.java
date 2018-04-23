package com.lwl.boot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwl.boot.mapper.ItemMapper;
import com.lwl.boot.model.Item;
import com.lwl.boot.service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Resource
	private ItemMapper itemMapper;
	
	@Override
	public void add(Item i) {
		itemMapper.add(i);		
	}

	@Override
	public List<Item> find() {
		return itemMapper.find();
	}

	
	
}
