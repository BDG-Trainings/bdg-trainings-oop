package com.bdg.master.bas;

//See https://en.wikipedia.org/wiki/ISO_3166-1
public enum Country {

    FR("France", "250"),
    IT("Italy", "380"),
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

    public static Country findByCountryName(final String countryName) {
        for (Country country: Country.values()) {
            if (country.getCountryName() == countryName)
                return country;
        }
        return null;
    }

    public static Country findByNumericCode(final String numericCode) {
        for (Country country: Country.values()) {
            if (country.getNumericCode() == numericCode)
                return country;
        }
        return null;
    }

}
