package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem;

public class Account {

    private Customer customer;
    private CreditCard  creditCard;
    private AccountBalance accountBalance;

    public Account(Customer customer,CreditCard  creditCard, AccountBalance accountBalance) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;

    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CreditCard getCreditCard()
    {
        return creditCard;
    }

    public void setCreditCard (CreditCard creditCard) {

        this.creditCard = creditCard;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance (AccountBalance accountBalance) {
        this.accountBalance = accountBalance;

    }
    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", accountDetail=" + creditCard +
                ", accountBalance=" + accountBalance +
                '}';
    }

}
