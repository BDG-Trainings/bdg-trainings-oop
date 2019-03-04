package com.bdg.agalayan.bankAccountSystem.service;

import com.bdg.agalayan.bankAccountSystem.entity.CreditCard;
import com.bdg.agalayan.bankAccountSystem.entity.Customer;
import com.bdg.agalayan.bas.AccountBalance;

public class AccountCreateParameter {
    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public AccountCreateParameter(Customer customer, CreditCard creditCard, AccountBalance accountBalance){
        this.customer=customer;
        this.creditCard=creditCard;
        this.accountBalance=accountBalance;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }
}
