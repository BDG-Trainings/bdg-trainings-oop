package com.bdg.vkaramyan.bankaccountsystem;

public enum Country {
	
	AM("Armenia", "051"),
	RUS("Russia", "060"),
	IT("Italy", "090");
	
	
	private final String countryName;
	private final String numericCode;
	
	
	private Country(final String countryName, final String numericCode) {
		this.countryName = countryName;
		this.numericCode = numericCode;
	}
	
	

}
