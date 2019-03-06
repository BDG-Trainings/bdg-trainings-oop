package com.bdg.vkaramyan.bankaccountsystem.CRUD;

import com.bdg.vkaramyan.bankaccountsystem.common.CountryCode;
import com.bdg.vkaramyan.bankaccountsystem.common.PhoneType;

public class PhoneNumberCreateParameter {

	private CountryCode countryCode;
	private String number;
	private PhoneType type;

	public PhoneNumberCreateParameter(CountryCode countryCode, String number, PhoneType type) {

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
		return "PhoneNumberCreateParameter [countryCode=" + countryCode + ", number=" + number + ", type=" + type + "]";
	}

}
