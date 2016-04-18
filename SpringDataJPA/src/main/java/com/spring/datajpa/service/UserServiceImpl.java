package com.spring.datajpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.spring.datajpa.model.User;
import com.spring.datajpa.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		List<User> user = (List<User>) userRepository.findAll();
		if (user == null) {
			user = new ArrayList<User>();
		}
		return user;
	}
	
	public Page<User> findAllByPagination() {
		Page<User> user = userRepository.findAll(createPageRequest());
		return user;
	}
	
	private Pageable createPageRequest() {
	    return new PageRequest(1, 10);
	}
	
}
