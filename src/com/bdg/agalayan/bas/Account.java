package com.bdg.agalayan.bas;


public final class Account {

    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final Customer customer, AccountBalance balance) {
        this.customer=customer;
        this.accountBalance=balance;
    }

    public double getAccountBalance() {
        return accountBalance.getBalance();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void deposit(final double amount) {
        this.accountBalance.deposit(amount);
    }

    public void withdraw(final double amount) {
        if(this.getAccountBalance()>=amount){
            this.accountBalance.withdraw(amount);
        }
    }
    @Override
    public String toString(){
        return "Account[" + getCustomer() + "," + "balance = " + accountBalance.getBalance();
    }
}
