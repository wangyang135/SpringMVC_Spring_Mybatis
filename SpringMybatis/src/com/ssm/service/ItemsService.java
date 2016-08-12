package com.ssm.service;

import java.util.List;

import com.ssm.domain.Items;
import com.ssm.domain.ItemsCustom;
import com.ssm.domain.ItemsCustomVo;

public interface ItemsService {

	public List<ItemsCustom> findItemsList(Items items);
	/**
	 * 通过id获得ItemsCustom对象
	 * @param items
	 * @return
	 */
	public ItemsCustom findItemsById(Integer id);
	
	public void updateItemsCustom(ItemsCustom itemsCustom);
	
}
