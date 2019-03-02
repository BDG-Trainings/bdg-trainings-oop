package com.bdg.vqertikyan.bankaccountsystem.common;

public enum CountryCode {
    ARM("+374", Country.AM),
    ITA("+39", Country.IT);

    private final String countryCode;
    private final Country country;

    CountryCode(final String countryCode, final Country country){
        this.countryCode = countryCode;
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Country getCountry() {
        return country;
    }
}
