package com.bdg.resourcemanagement.vkaramyan;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zipCode;
	
	public Address(final String street, final String city, final String state, final String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

}