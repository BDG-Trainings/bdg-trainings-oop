package com.bdg.agalayan.bankAccountSystem.enums;

public enum CountryCode {
    AM("+374", Country.AM),
    AF("+93", Country.AF),
    IT("+39", Country.IT),
    US("+1", Country.US),
    FR("+33", Country.FR);

    //I think we need getters for this fields
    private final String countryCode;
    private final Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
    public String getCountryCode() {
        return countryCode;
    }

}
