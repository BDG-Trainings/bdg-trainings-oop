package com.bdg.hhertevtsyan.bankaccountsystem.common;

public enum CountryCode {
    AFG("+93", Country.AF),
    ARM("+374", Country.AM),
    FRA("+33", Country.FR),
    ITA("+39", Country.IT),
    USA("+1", Country.US);

    String countryCode;
    Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }
}
