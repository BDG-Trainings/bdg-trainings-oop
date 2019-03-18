package com.bdg.vkaramyan.bankaccountsystem.CRUD;

import java.util.Arrays;

import com.bdg.vkaramyan.bankaccountsystem.common.Country;
import com.bdg.vkaramyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.vkaramyan.bankaccountsystem.entity.CreditCard;
import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;
import com.bdg.vkaramyan.bankaccountsystem.entity.PhoneNumber;


//ete menq unenq AccountCreateParameter class => vor ira bolor field-ery petqa linen create parameters nerov
//orinak PhoneNumberCreateParameter kam CreditCardCreateParameter

public class AccountCreateParameter {
	
	//Inchiya mez petq customer-y estex?
    //nerqevum unenq arden customerCreateParameter
	
	private Country country;
	private PhoneNumber phoneNumber;
	//Account class-um 1 customer ka => CustomerCreateParameter chpetq e array lini
	private CustomerCreateParameter customerCreateParameter;
	private CreditCard creditCard;
	private AccountBalance accountBalance;
	
	public AccountCreateParameter(Customer customer, Country country, PhoneNumber phoneNumber,
			CustomerCreateParameter customerCreateParameter, CreditCard creditCard, AccountBalance accountBalance) {
		
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.customerCreateParameter = customerCreateParameter;
		this.creditCard = creditCard;
		this.accountBalance = accountBalance;
	}

	

	public Country getCountry() {
		return country;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public CustomerCreateParameter getCustomerCreateParameter() {
		return customerCreateParameter;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public AccountBalance getAccountBalance() {
		return accountBalance;
	}

	
	public void setCountry(Country country) {
		this.country = country;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCustomerCreateParameter(CustomerCreateParameter customerCreateParameter) {
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
		return "AccountCreateParameter [country=" + country + ", phoneNumber=" + phoneNumber
				+ ", customerCreateParameter=" + customerCreateParameter + ", creditCard=" + creditCard
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
	
}