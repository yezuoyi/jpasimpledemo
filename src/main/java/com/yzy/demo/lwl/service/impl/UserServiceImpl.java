package com.yzy.demo.lwl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzy.demo.lwl.model.UserDomain;
import com.yzy.demo.lwl.repository.UserDao;
import com.yzy.demo.lwl.service.UserService;

/**
 * Created by Andy on 2016/10/30.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public UserDomain findUserByUserNo(String userNo) {
		return userDao.findByUserNo(userNo);
	}
}