package com.bdg.aidaghalayan.bankaccountsystem.service;


import com.bdg.aidaghalayan.bankaccountsystem.entity.AccountBalance;

public interface AccountBalanceService {

    AccountBalance create(double balance);

    AccountBalance create(String balanceContent);
}
