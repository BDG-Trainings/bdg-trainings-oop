package com.bdg.spapoyan.bankAccountSystem;


import com.bdg.spapoyan.bankAccountSystem.entity.AbstractBankEntity;
import com.bdg.spapoyan.bas.AccountBalance;

public class Account extends AbstractBankEntity {


    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public Account(int id, Customer customer, CreditCard creditCard, AccountBalance accountBalance) {
        super(id);
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

    public CreditCard getCreditCard() { return creditCard; }

    public void setCreditCard(CreditCard creditCard) { this.creditCard = creditCard; }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", creditCard=" + creditCard +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
