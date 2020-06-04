package com.javabank.online.dao;

import org.springframework.data.repository.CrudRepository;

import com.javabank.online.domain.User;

public interface UserDao extends CrudRepository<User, Long> {
	
	User findByUsername(String username);
	User findByEmail(String email);	

}
