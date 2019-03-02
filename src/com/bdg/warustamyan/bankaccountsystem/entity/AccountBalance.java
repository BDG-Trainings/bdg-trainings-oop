package com.bdg.warustamyan.bankaccountsystem.entity;


public final class AccountBalance extends AbstractBankEntity {

    private double balance;

    public AccountBalance(final double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }
}
