package com.bdg.vkaramyan.bankaccountsystem.service;

import com.bdg.vkaramyan.bankaccountsystem.common.AccountCreateParameter;
import com.bdg.vkaramyan.bankaccountsystem.entity.Account;


public interface AccountService {
	
	Account create(AccountCreateParameter accountCreateParameter);
	Account delete();
	Account update();
	Account get();

}
