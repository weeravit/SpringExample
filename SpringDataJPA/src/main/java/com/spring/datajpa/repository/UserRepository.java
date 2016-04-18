package com.spring.datajpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.datajpa.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	Page<User> findAll(Pageable pageRequest);
	
	@Query(value = "SELECT u FROM User u")
	Page<User> yoyo(Pageable pageRequest);
	
}
