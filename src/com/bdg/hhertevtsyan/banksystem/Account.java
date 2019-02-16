package com.bdg.hhertevtsyan.banksystem;

public final class Account {
    private int accountNumber;
    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final int accountNumber, final Customer customer, final AccountBalance balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        accountBalance = balance;
    }

    public void deposit(final double amount) {
        accountBalance.deposit(amount);
    }

    public void withdraw(final double amount) {
        accountBalance.withdraw(amount);
    }

    public int getAccountNumber () {
        return accountNumber;
    }

    public double getBalance() {
        return accountBalance.getBalance();
    }

    public Customer getCustomer() {
        return customer;
    }
}