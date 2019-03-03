package com.bdg.osahakyan.bas;

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

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void deposit(final double amount) {
        getAccountBalance().deposit(amount);
    }

    public boolean withdraw(final double amount) {
        if(accountBalance.getBalance() >= amount) {
         return true;
        }
        return false;
    }
}
