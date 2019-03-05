package com.bdg.vkaramyan.bankaccountsystem.common;

import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;
import com.bdg.vkaramyan.bankaccountsystem.entity.PhoneNumber;

public class AccountCreateParameter {
	
	
	private Customer customer;
	private Country country;
	private PhoneNumber phoneNumber;
	public AccountCreateParameter(final Customer customer, final Country country, final PhoneNumber phoneNumber) {
		
		this.customer = customer;
		this.country = country;
		this.phoneNumber = phoneNumber;
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
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "AccountCreateParameter [customer=" + customer + ", country=" + country + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	

}
