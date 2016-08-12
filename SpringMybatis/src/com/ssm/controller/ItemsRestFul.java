package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.domain.ItemsCustom;
import com.ssm.service.ItemsService;

@Controller
public class ItemsRestFul {

	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/itemsRestFul/{id}")
	public @ResponseBody ItemsCustom itemsView(@PathVariable("id") Integer id){
		ItemsCustom itemsCustom = itemsService.findItemsById(id);
		return itemsCustom;
	}
}
