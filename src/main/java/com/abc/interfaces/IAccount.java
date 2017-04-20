package com.abc.interfaces;

import com.abc.AccountType;

public interface IAccount {
	void deposit(double amount);
	void withdraw(double amount);
	double getTotalBalance();
	public ITransaction getRootTransaction();
	double compoundInterestEarned();
	AccountType getAccountType();
}
