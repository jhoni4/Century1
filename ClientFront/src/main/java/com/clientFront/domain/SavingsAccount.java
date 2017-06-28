package com.clientFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class SavingsAccount {
	private Long id;
	private int accountNumber;
	private BigDecimal accountBalance;

	private List<SavingsTransaction> savingsTransactionList;
	
}
