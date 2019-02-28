package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem;

public class Account {

    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    public Account(Customer customer, AccountDetail accountDetail, AccountBalance accountBalance) {
        this.customer = customer;
        this.accountDetail = accountDetail;
        this.accountBalance = accountBalance;

    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", accountDetail=" + accountDetail +
                ", accountBalance=" + accountBalance +
                '}';
    }

}
