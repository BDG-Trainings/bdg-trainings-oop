package com.bdg.spapoyan.bankAccountSystem.enumBankAccountSystem;

public enum Country {

    AM("Armenia","051"),
    RU("Russian Federation", "643"),
    US("United States of America", "840");

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
