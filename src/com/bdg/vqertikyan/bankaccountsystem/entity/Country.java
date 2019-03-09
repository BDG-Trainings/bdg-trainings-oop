package com.bdg.master.bankaccountsystem.entity;


import com.bdg.master.bankaccountsystem.CountryNotFoundException;

public enum Country {

    ARM("Armenia", "051");

    private final String countryName;
    private final String numericCode;

    Country(final String countryName, final String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public static Country findByName(final String countryName) {
        for (final Country c : values()) {
            if (c.countryName.equalsIgnoreCase(countryName)) {
                return c;
            }
        }
        throw new CountryNotFoundException(countryName);
    }

}
