package com.springdb.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdb.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired(required = false)
	private SessionFactory sessionFactory;
	
	@Override
	public List<User> findAll() {
		List<User> users = sessionFactory.getCurrentSession().createCriteria(User.class).list();
		return users;
	}

	@Override
	public User findById(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
