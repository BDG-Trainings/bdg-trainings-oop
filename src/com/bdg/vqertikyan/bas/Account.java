package com.bdg.vqertikyan.bas;


public final class Account {

    private Customer customer;
    private AccountBalance accountBalance;

    public Account(Customer customer, AccountBalance accountBalance) {
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
