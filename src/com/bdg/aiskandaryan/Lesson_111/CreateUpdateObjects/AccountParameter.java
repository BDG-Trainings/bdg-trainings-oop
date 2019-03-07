package com.bdg.aiskandaryan.Lesson_111.CreateUpdateObjects;

import com.bdg.aiskandaryan.Lesson_111.Customer;
import com.bdg.aiskandaryan.Lesson_111.Entities.AccountBalance;
import com.bdg.aiskandaryan.Lesson_111.Entities.CreditCard;

public class AccountParameter {
    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public AccountParameter(final Customer customer, final CreditCard creditCard, final AccountBalance accountBalance) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }
}
