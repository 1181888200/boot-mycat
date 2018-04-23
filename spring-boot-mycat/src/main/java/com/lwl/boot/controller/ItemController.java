package com.lwl.boot.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.model.Item;
import com.lwl.boot.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	
	@Resource
	private ItemService itemService;
	
	@RequestMapping("/add")
	public String add(Long id,String value) {
		Item i = new Item();
		i.setId(id).setValue(value).setIndate(new Date());
		itemService.add(i);
		return "添加成功";
	}
	
	
	
	@RequestMapping("/find")
	public List<Item> find() {
		return itemService.find();
	}
	
	
	
}
