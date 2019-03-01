package com.bdg.vkaramyan.bankaccountsystem;

public class PhoneNumber extends AbstractBankEntity {

	private CountryCode countryCode;
	private String number;
	private PhoneType type;

	public PhoneNumber(int id, CountryCode countryCode, String number, PhoneType type) {
		super(id);
		this.countryCode = countryCode;
		this.number = number;
		this.type = type;
	}

	public CountryCode getCountryCode() {
		return countryCode;
	}

	public String getNumber() {
		return number;
	}

	public PhoneType getType() {
		return type;
	}

	public void setCountryCode(CountryCode countryCode) {
		this.countryCode = countryCode;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setType(PhoneType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PhoneNumber [countryCode=" + countryCode + ", number=" + number + ", type=" + type + "]";
	}

}
