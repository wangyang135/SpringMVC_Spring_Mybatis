package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.domain.User;
import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	
	@Override
	public List<User> getUserList() {
		
		return userMapper.getUserList();
	}
	
}
