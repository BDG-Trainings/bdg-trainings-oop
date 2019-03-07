package com.bdg.aiskandaryan.Lesson_111;

import com.bdg.aiskandaryan.Lesson_111.Entities.AbstractBankEntity;
import com.bdg.aiskandaryan.Lesson_111.Entities.AccountBalance;
import com.bdg.aiskandaryan.Lesson_111.Entities.CreditCard;

import java.time.LocalDate;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public Account(final int id, final Customer customer, final CreditCard creditCard, final AccountBalance accountBalance) {
        super(id);
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
        this.updatedDate = LocalDate.now();
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(final CreditCard creditCard) {
        this.creditCard = creditCard;
        this.updatedDate = LocalDate.now();
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
        this.updatedDate = LocalDate.now();
    }
}