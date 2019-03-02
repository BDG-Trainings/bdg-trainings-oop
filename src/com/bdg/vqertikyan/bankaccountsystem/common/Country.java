package com.bdg.vqertikyan.bankaccountsystem.common;

public enum Country {

    AM("Armenia", "051"),
    IT("Italy", "380");

    private final String countryName;
    private final String numericCode;

    Country(final String countryName, final String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getNumericCode() {
        return this.numericCode;
    }

}
