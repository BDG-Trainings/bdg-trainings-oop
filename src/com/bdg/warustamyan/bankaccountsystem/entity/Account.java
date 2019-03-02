package com.bdg.warustamyan.bankaccountsystem.entity;


public final class Account extends AbstractBankEntity {

    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public Account(final Customer customer) {
        this.customer = customer;
    }

    public Account(final Customer customer, final CreditCard creditCard, final AccountBalance accountBalance) {
        this.customer = customer;
        this.accountBalance = accountBalance;
        this.creditCard = creditCard;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(final CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }
}
