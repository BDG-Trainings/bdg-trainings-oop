package com.bdg.vkaramyan.bankaccountsystem;

public enum CountryCode {
	
	ARM ("+374", Country.AM),
	RUS ("+7", Country.RUS),
	IT  ("+39", Country.IT);
	
	
	private final String countryCode;
	private final Country country;
	
	private CountryCode(String countryCode, Country country) {
		this.countryCode = countryCode;
		this.country = country;
	}
	
}

