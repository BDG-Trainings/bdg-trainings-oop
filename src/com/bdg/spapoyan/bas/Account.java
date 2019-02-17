package com.bdg.spapoyan.bas;


public final class Account {

    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final Customer customer, final AccountBalance balance) {
        this.customer = customer;
        this.accountBalance = balance;

    }

    public void deposit(final double amount) {

    }

    public void withdraw(final double amount) {

    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
