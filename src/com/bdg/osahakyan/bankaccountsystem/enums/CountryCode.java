package com.bdg.osahakyan.bankaccountsystem.enums;

public enum CountryCode {

//source--> https://countrycode.org/

    ARM("+374", Country.AM),
    USA("+1", Country.USA),
    CHN("+86", Country.CHN);

    private final String countryCode;
    private final Country country;

    CountryCode(final String countryCode, final Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public Country getCountry() {
        return this.country;
    }
}
