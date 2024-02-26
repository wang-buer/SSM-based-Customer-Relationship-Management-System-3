package com.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.dao.UserDao;
import com.crm.entity.User;
import com.crm.service.UserService;

/**
 * �û�Serviceʵ����
 * @author Administrator
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

	@Override
	public List<User> find(Map<String, Object> map) {
		return userDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return userDao.getTotal(map);
	}

	@Override
	public int update(User user) {
		return userDao.update(user);
	}

	@Override
	public int add(User user) {
		return userDao.add(user);
	}

	@Override
	public int delete(Integer id) {
		return userDao.delete(id);
	}
}
