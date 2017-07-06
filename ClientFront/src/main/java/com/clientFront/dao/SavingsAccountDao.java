package com.clientFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.clientFront.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

	SavingsAccount findByAccountNumber(int accountNumber);

	

}
