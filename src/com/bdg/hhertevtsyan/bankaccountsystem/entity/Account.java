package com.bdg.hhertevtsyan.bankaccountsystem.entity;

import com.bdg.hhertevtsyan.bankaccountsystem.AbstractBankEntity;
import com.bdg.hhertevtsyan.bankaccountsystem.AccountBalance;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final int id, final Customer customer, final AccountBalance accountBalance) {
        super(id);
        this.customer = customer;
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }
}
