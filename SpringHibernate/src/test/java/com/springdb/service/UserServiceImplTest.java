package com.springdb.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springdb.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class UserServiceImplTest {
	
	@Autowired
	UserService userService;
	
	@Test
	public void findAll_shouldBeTrue_whenUsersEmpty() {
		
		boolean result = false;
		List<User> users = userService.findAll();
		
		if (users.isEmpty()) {
			result = true;
		}
		
		Assert.assertTrue(result);
	}
	
}
