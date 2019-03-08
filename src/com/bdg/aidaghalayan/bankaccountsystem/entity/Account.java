package com.bdg.aidaghalayan.bankaccountsystem.entity;


public final class Account extends AbstractBankEntity {

    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public Account(final Customer customer, final CreditCard creditCard, final AccountBalance accountBalance) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
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

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", creditCard=" + creditCard +
                ", accountBalance=" + accountBalance +
                ", id=" + id +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", deletedDate=" + deletedDate +
                '}';
    }
}
