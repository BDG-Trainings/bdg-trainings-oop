package com.bdg.master.bankaccountsystem.entity;


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
}
