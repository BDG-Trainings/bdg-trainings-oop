package com.bdg.vqertikyan.bankaccountsystem.service;

import com.bdg.vqertikyan.bankaccountsystem.entity.Account;
import com.bdg.vqertikyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.vqertikyan.bankaccountsystem.entity.CreditCard;
import com.bdg.vqertikyan.bankaccountsystem.entity.Customer;

public interface AccountService {
    Account create(Customer customer, CreditCard creditCard, AccountBalance balance);
}