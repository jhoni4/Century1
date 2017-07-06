package com.clientFront.service;

import com.clientFront.domain.PrimaryAccount;
import com.clientFront.domain.SavingsAccount;

public interface AccountService {

	PrimaryAccount createPrimaryAccount();

	SavingsAccount createSavingsAccount();


}
