package com.ssm.service;

import java.util.List;

import com.ssm.entity.User;

public interface UserService {
	public User findUserById(Integer id);
	
	public void insert(User user);
	
	public List<User> findAll(int offset,int limit);
}
