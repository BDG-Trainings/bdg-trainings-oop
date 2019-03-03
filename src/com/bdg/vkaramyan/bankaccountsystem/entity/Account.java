package com.bdg.vkaramyan.bankaccountsystem.entity;

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

	public CreditCard getAccountDetail() {
		return creditCard;
	}

	public AccountBalance getAccountBalance() {
		return accountBalance;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAccountDetail(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public void setAccountBalance(AccountBalance accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", creditCard=" + creditCard + ", accountBalance="
				+ accountBalance + "]";
	}

}
