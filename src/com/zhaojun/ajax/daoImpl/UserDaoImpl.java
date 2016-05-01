package com.zhaojun.ajax.daoImpl;

import org.hibernate.Session;

import com.zhaojun.ajax.dao.UserDao;
import com.zhaojun.ajax.model.User;


public class UserDaoImpl implements UserDao {

	@Override
	public void saveUser(User user) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		  session.beginTransaction();
		  session.save(user);
	      session.getTransaction().commit();
	}

}
