package com.bdg.resourcemanagement.vkaramyan;

import java.util.Arrays;

public class Address {
	
	private Country [] country;
	private String phoneNumber;
	private String street;
	
	public Address(final Country[] country, final String phoneNumber, final String street) {
		super();
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.street = street;
	}

	public Country[] getCountry() {
		return country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setCountry(Country[] country) {
		this.country = country;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [country=" + Arrays.toString(country) + ", phoneNumber=" + phoneNumber + ", street=" + street
				+ "]";
	}
	
	
}
