package com.zhaojun.ajax.serviceImpl;

import com.zhaojun.ajax.dao.UserDao;
import com.zhaojun.ajax.daoImpl.UserDaoImpl;
import com.zhaojun.ajax.model.User;
import com.zhaojun.ajax.service.SaveService;



public class SaveServiceImpl implements SaveService {
	private UserDao userDao = new UserDaoImpl();
	@Override
	public void saveUser(User user) {		
		userDao.saveUser(user);

	}

}
