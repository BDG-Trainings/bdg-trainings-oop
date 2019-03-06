package com.bdg.master.bankaccountsystem.service;


import com.bdg.master.bankaccountsystem.entity.AccountBalance;

public interface AccountBalanceService {

    AccountBalance create(double balance);

    AccountBalance create(String balanceContent);
}
