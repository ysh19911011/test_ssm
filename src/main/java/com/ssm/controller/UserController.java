package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.User;
import com.ssm.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/index")
	public String index(HttpServletRequest request,Model model){
		List<User> users=userService.findAll(0, 100);
		for(User user:users){
			System.out.println(user.getName());
		}
		model.addAttribute("users",users);
		return "/index";
	}
	@RequestMapping("/reg")
	public String index(HttpServletRequest request,Model model,User user){
		System.out.println(user.getName());
		System.out.println(user.getSex());
		System.out.println(user.getAge());
		userService.insert(user);
		
		return "/index";
	}
}
