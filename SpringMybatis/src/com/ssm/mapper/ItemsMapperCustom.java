package com.ssm.mapper;

import java.util.List;

import com.ssm.domain.Items;
import com.ssm.domain.ItemsCustom;


public interface ItemsMapperCustom {
   
	public List<ItemsCustom> findItemsList(Items items);
}