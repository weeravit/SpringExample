package com.springdb.mock.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springdb.dao.UserDao;
import com.springdb.model.User;
import com.springdb.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mock.xml"})
public class UserServiceImplTest {

	@Mock
	UserDao userDao;
	
	@Autowired
	@InjectMocks
	UserService userService;
	
	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void findAll_shouldReturnSameUsers_whenInputUsers() {
		List<User> usersMock = Arrays.asList(new User("Mock"), new User("Mockito"));
		when(userDao.findAll()).thenReturn(usersMock);
		
		List<User> users = userService.findAll();
		
		assertSame(users, usersMock);
	}

}
