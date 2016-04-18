package com.springdb.service;

import java.util.List;

import com.springdb.model.User;

public interface UserService {

	public List<User> findAll();
	public User findById(int user_id);
	public boolean insert(User user);
	public boolean update(User user);
	
}
