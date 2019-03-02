package com.bdg.agalayan.bankAccountSystem;

import com.bdg.agalayan.bas.AccountBalance;
import com.bdg.agalayan.lessons_07.Date;

public class Account extends AbstractBankEntity {
    private Customer customer;
    private AccountDetail accountDetail;
    private AccountBalance accountBalance;

    Account(int id,AccountBalance balance, AccountDetail detail) {
        super(id);
        this.accountDetail=detail;
        this.accountBalance=balance;
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
        super.setUpdatedDate(updatedDate);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        super.setCreatedDate(createdDate);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public Date getUpdatedDate() {
        return super.getUpdatedDate();
    }

    @Override
    public Date getCreatedDate() {
        return super.getCreatedDate();
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public AccountDetail getAccontDetail() {
        return accountDetail;

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setAccontDetail(AccountDetail accountDetail) {
        this.accountDetail = accountDetail;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCastomer(Customer customer) {
        this.customer = customer;
    }
}
