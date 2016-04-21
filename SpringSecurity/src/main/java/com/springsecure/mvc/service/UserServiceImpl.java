package com.springsecure.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springsecure.mvc.model.User;
import com.springsecure.mvc.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}
	
	public boolean insert(User user) {
		boolean result = true;
		try {
			userRepository.save(user);
		} catch (DataIntegrityViolationException e) {
			result = false;
		}
		return result;
	}

}
