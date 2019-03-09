package com.bdg.vqertikyan.bankaccountsystem.service;


import com.bdg.vqertikyan.bankaccountsystem.entity.AccountBalance;

public interface AccountBalanceService {

    AccountBalance create(double balance);

    AccountBalance create(String balanceContent);
}
