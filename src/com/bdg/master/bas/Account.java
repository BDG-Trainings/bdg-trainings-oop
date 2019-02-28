package com.bdg.master.bas;


public final class Account {

    private Customer customer;
    private AccountBalance accountBalance;

    public Account(final Customer customer, final AccountBalance balance) {
        this.customer = customer;
        this.accountBalance = balance;

    }

    public void deposit(final double amount) {
            this.accountBalance.deposit(amount);
    }

    public void withdraw(final double amount) {
            this.accountBalance.withdraw(amount);
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAccountBalance() {
        return this.accountBalance.getBalance();
    }

    @Override
    public String toString() {
        return "Account{"+
                    "deposit:" + '\'' + accountBalance.getBalance() + '\''+
                    ",costumer:"+ '\'' + customer.getCustomerSurname() + '\''+
                "}";
    }
}
