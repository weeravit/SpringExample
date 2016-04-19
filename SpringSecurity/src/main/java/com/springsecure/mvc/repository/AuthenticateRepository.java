package com.springsecure.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import com.springsecure.mvc.model.Authenticate;

public interface AuthenticateRepository extends CrudRepository<Authenticate, Long> {

	public Authenticate findByUsername(String username);
	
}
