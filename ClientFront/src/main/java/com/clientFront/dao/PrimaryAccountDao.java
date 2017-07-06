package com.clientFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.clientFront.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

	PrimaryAccount findByAccountNumber(int accountNumber);


}
