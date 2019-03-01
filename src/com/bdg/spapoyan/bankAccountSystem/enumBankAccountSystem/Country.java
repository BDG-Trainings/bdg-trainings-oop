package com.bdg.spapoyan.bankAccountSystem.enumBankAccountSystem;

public enum Country {

    AM("Armenia","051");





    private final String countryName;
    private final String numericCode;

    Country(String countryName, String numericCode) {
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
