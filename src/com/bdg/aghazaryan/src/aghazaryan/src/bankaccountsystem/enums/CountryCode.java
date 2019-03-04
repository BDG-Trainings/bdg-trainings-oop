package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.enums;

import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.CountryCodeNotFoundException;

public enum CountryCode {

    ARM("+374", Country.ARM),
    USA("+1",Country.USA),
    UK("+44", Country.UK),
    IT("+39",Country.IT),
    FR("+33", Country.FR);


    private final String countryCode;
    private final Country country;

    CountryCode (final String countryCode, final Country country) {
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