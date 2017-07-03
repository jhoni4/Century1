package com.clientFront.Dao;

import org.springframework.data.repository.CrudRepository;

import com.clientFront.domain.User;

public interface UserDao extends CrudRepository<User, Long> {
	User findByUsername(String username);
	User findByEmail(String email);

}
