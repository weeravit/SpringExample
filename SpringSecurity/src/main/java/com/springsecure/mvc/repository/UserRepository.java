package com.springsecure.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import com.springsecure.mvc.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
