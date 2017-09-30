package com.ali.user_consumer.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ali.api.domain.User;
import com.ali.api.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("list")
	@ResponseBody
	public ArrayList<User> queryUser(@RequestParam("name") String name){
		return service.queryUserByName(name);
	}
	
	@RequestMapping("add")
	public int addUser(@ModelAttribute("user") User user){
		return service.addUser(user);
	}
}
