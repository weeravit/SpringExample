package com.spring.datajpa.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.spring.datajpa.model.User;

public interface UserService {

	public List<User> findAll();
	public Page<User> findAllByPagination();
	
}
