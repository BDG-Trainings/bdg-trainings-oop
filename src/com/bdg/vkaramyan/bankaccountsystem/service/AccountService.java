package com.bdg.vkaramyan.bankaccountsystem.service;

import com.bdg.vkaramyan.bankaccountsystem.CRUD.AccountCreateParameter;
import com.bdg.vkaramyan.bankaccountsystem.entity.Account;


public interface AccountService {

    Account create(AccountCreateParameter createParameter);

    boolean delete();

    Account update();

    Account get();


}
