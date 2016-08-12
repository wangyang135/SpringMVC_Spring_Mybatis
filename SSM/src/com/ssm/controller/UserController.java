package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.domain.User;
import com.ssm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUserList")
	public ModelAndView getUserList() {
		List<User> userList = userService.getUserList();
		
		ModelAndView model = new ModelAndView();
		model.addObject("userList", userList);
		model.setViewName("user");
		return model;
	}
}
