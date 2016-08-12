package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.domain.Items;
import com.ssm.domain.ItemsCustom;
import com.ssm.domain.ItemsCustomVo;
import com.ssm.mapper.ItemsMapper;
import com.ssm.mapper.ItemsMapperCustom;
import com.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService{

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	public List<ItemsCustom> findItemsList(Items items) {
		return itemsMapperCustom.findItemsList(items);
	}

	public ItemsCustom findItemsById(Integer id) {
		Items items = itemsMapper.selectByPrimaryKey(id);
		ItemsCustom itemsCustom = null;
		if(items != null){
			itemsCustom = new ItemsCustom();
			BeanUtils.copyProperties(items, itemsCustom);
		}
		return itemsCustom;
	}

	public void updateItemsCustom(ItemsCustom itemsCustom) {
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
	}


}
