package com.bdg.akarapetyan.bas;

public final class Account {

    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final Customer customer, final AccountBalance balance) {
        this.customer = customer;
        this.accountBalance = balance;
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

    public void deposit(final double amount) {

    }

    public void withdraw(final double amount) {

    }
}