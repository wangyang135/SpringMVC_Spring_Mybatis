package com.ssm.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemsCustomVo {

	private ItemsCustom itemsCustom;

	private List<ItemsCustom> itemsCustomList;
	
	private Map<String, ItemsCustom> itemsCustomMap = new HashMap<String, ItemsCustom>();
	
	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

	public List<ItemsCustom> getItemsCustomList() {
		return itemsCustomList;
	}

	public void setItemsCustomList(List<ItemsCustom> itemsCustomList) {
		this.itemsCustomList = itemsCustomList;
	}

	public Map<String, ItemsCustom> getItemsCustomMap() {
		return itemsCustomMap;
	}

	public void setItemsCustomMap(Map<String, ItemsCustom> itemsCustomMap) {
		this.itemsCustomMap = itemsCustomMap;
	}
	
	
}
