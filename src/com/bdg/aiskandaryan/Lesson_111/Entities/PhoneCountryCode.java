package com.bdg.aiskandaryan.Lesson_111.Entities;

public enum PhoneCountryCode {
    ARM("+374", Country.AM), RUS("+495", Country.RU), USA("+001", Country.US);

    private final String countryCode;
    private final Country country;

    PhoneCountryCode(final String countryCode, final Country country) {
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
