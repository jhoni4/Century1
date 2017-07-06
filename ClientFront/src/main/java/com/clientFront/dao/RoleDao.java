package com.clientFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.clientFront.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {

	Role findByName(String name);


}
