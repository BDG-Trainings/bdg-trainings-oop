package com.bdg.spapoyan.bas;


public final class Account {

    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final Customer customer, final AccountBalance balance) {
        this.customer = customer;
        this.accountBalance = balance;

    }

    public void deposit(final double amount) {
        boolean success = false;
        if(this.accountBalance.getBalance()+ amount == accountBalance.getBalance()) {
            this.accountBalance.deposit(amount);
            success = true;
        }
    }

    public boolean withdraw(final double amount) {
        boolean success = false;
        if(this.accountBalance.getBalance()>=amount){
            this.accountBalance.withdraw(amount);
            success = true;
        }
        return success;
    }
}

