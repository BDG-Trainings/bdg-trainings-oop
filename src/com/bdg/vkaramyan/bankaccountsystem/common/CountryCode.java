package com.bdg.vkaramyan.bankaccountsystem.common;

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

	public String getCountryCode() {
		return countryCode;
	}

	public Country getCountry() {
		return country;
	}

	public static CountryCode findByCountryCode(final String countryCode) {
        for (final CountryCode c : values()) {
            if (c.countryCode.equalsIgnoreCase(countryCode)) {
                return c;
            }
        }
        throw new CountryCodeNotFoundException(countryCode);
    }
	
	
	
	
}

