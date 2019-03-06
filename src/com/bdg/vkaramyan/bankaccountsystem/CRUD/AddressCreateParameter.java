package com.bdg.vkaramyan.bankaccountsystem.CRUD;

import java.util.Arrays;

import com.bdg.vkaramyan.bankaccountsystem.common.Country;
import com.bdg.vkaramyan.bankaccountsystem.entity.PhoneNumber;

public class AddressCreateParameter {

	private Country country;
	private String street;
	private PhoneNumber[] phoneNumber;

	public AddressCreateParameter(Country country, String street, PhoneNumber[] phoneNumber) {

		this.country = country;
		this.street = street;
		this.phoneNumber = phoneNumber;
	}

	public Country getCountry() {
		return country;
	}

	public String getStreet() {
		return street;
	}

	public PhoneNumber[] getPhoneNumber() {
		return phoneNumber;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPhoneNumber(PhoneNumber[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "AddressCreateParameter [country=" + country + ", street=" + street + ", phoneNumber="
				+ Arrays.toString(phoneNumber) + "]";
	}

}
