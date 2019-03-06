package com.bdg.vkaramyan.bankaccountsystem.common;

import java.util.Arrays;

import com.bdg.vkaramyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.vkaramyan.bankaccountsystem.entity.CreditCard;
import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;
import com.bdg.vkaramyan.bankaccountsystem.entity.PhoneNumber;

public class AccountCreateParameter {
	
	
	private Customer customer;
	private Country country;
	private PhoneNumber phoneNumber;
	private CustomerCreateParameter [] customerCreateParameter;
	private CreditCard creditCard;
	private AccountBalance accountBalance;
	
	public AccountCreateParameter(Customer customer, Country country, PhoneNumber phoneNumber,
			CustomerCreateParameter[] customerCreateParameter, CreditCard creditCard, AccountBalance accountBalance) {
		super();
		this.customer = customer;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.customerCreateParameter = customerCreateParameter;
		this.creditCard = creditCard;
		this.accountBalance = accountBalance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Country getCountry() {
		return country;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public CustomerCreateParameter[] getCustomerCreateParameter() {
		return customerCreateParameter;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public AccountBalance getAccountBalance() {
		return accountBalance;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCustomerCreateParameter(CustomerCreateParameter[] customerCreateParameter) {
		this.customerCreateParameter = customerCreateParameter;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public void setAccountBalance(AccountBalance accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "AccountCreateParameter [customer=" + customer + ", country=" + country + ", phoneNumber=" + phoneNumber
				+ ", customerCreateParameter=" + Arrays.toString(customerCreateParameter) + ", creditCard=" + creditCard
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
	
}
