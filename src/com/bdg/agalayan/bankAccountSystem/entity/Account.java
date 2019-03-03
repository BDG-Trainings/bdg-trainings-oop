package com.bdg.agalayan.bankAccountSystem.entity;

import com.bdg.agalayan.bas.AccountBalance;

import java.time.LocalDate;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;


    //Remove id from constructor parameters
    //id is internal field and should be setup in persistence time
    Account(int id, AccountBalance balance, CreditCard creditCard) {
        super(id);
        this.creditCard = creditCard;
        this.accountBalance = balance;
    }

    @Override
    public void setUpdatedDate(LocalDate updatedDate) {
        super.setUpdatedDate(updatedDate);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setCreatedDate(LocalDate createdDate) {
        super.setCreatedDate(createdDate);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public LocalDate getUpdatedDate() {
        return super.getUpdatedDate();
    }

    @Override
    public LocalDate getCreatedDate() {
        return super.getCreatedDate();
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }


}
