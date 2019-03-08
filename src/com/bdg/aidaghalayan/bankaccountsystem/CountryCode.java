package com.bdg.aidaghalayan.bankaccountsystem;


public enum CountryCode {

    ARM("ARM"), USA("USA"), RUS("RUS");


    private final String countryCode;

    CountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return this.countryCode;
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
