package com.bdg.vkaramyan.bankaccountsystem;

public class Account extends AbstractBankEntity {

	private Customer customer;
	private Account accountDetail;
	private Account accountBalance;

	public Account(int id, Customer customer, Account accountDetail, Account accountBalance) {
		super(id);
		this.customer = customer;
		this.accountDetail = accountDetail;
		this.accountBalance = accountBalance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Account getAccountDetail() {
		return accountDetail;
	}

	public Account getAccountBalance() {
		return accountBalance;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAccountDetail(Account accountDetail) {
		this.accountDetail = accountDetail;
	}

	public void setAccountBalance(Account accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", accountDetail=" + accountDetail + ", accountBalance="
				+ accountBalance + "]";
	}

}
