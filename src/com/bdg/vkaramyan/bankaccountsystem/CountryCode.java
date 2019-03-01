package com.bdg.vkaramyan.bankaccountsystem;

public enum CountryCode {
	
	ARM ("+374", Country),
	RUS ("+7", "Russia"),
	IT  ("+39", "Italy");
	
	
	private final String countryCode;
	private final Country country;
	
	private CountryCode(final String countryCode, final Country country) {
		
		this.countryCode = countryCode;
		this.country = country;
	}
	
}
