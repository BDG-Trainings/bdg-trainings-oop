package com.bdg.aiskandaryan.Lesson_111;

import com.bdg.aiskandaryan.Lesson_111.Entities.AbstractBankEntity;
import com.bdg.aiskandaryan.Lesson_111.Entities.AccountBalance;
import com.bdg.aiskandaryan.Lesson_111.Entities.CreditCard;

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
}
