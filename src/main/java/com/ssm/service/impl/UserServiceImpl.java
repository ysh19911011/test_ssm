package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import com.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	public User findUserById(Integer id) {
		
		return this.userDao.findUserById(id);
	}

	public void insert(User user) {
		this.userDao.insert(user);
	}

	public List<User> findAll(int offset, int limit) {
		// TODO Auto-generated method stub
		return this.userDao.findAll(offset, limit);
	}

}
