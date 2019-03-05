package com.bdg.vkaramyan.bankaccountsystem.service;


import com.bdg.vkaramyan.bankaccountsystem.common.AccountCreateParameter;
import com.bdg.vkaramyan.bankaccountsystem.entity.Account;
import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;

public class AccountServiceImpl implements AccountService{
	
	@Override
	public Account create (AccountCreateParameter accountCreateParameter) {
		
		Account account = new Account(accountCreateParameter.getCustomer(), accountCreateParameter.getCountry(), accountCreateParameter.getPhoneNumber());
		
		return account;

	}

	@Override
	public Account delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account get() {
		// TODO Auto-generated method stub
		return null;
	}

}
