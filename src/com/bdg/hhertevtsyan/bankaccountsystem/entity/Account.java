package com.bdg.hhertevtsyan.bankaccountsystem.entity;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountBalance accountBalance;
    private CreditCard creditCard;

    public Account(final int id, final Customer customer, final AccountBalance accountBalance, final CreditCard creditCard) {
        super(id);
        this.customer = customer;
        this.accountBalance = accountBalance;
        this.creditCard = creditCard;
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

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
