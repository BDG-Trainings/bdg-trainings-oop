package com.bdg.spapoyan.bas;

//See https://en.wikipedia.org/wiki/ISO_3166-1
public enum Country {

    AF("Afghanistan", "004"),
    AM("Armenia", "051"),
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
        //Implement this functionality
        Country[] countries = values();

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].countryName == countryName) {
                return countries[i];
            }
        }

        return null;
    }

    public static Country findByNumericCode(final String numericCode) {
        //Implement this functionality
        for (Country country : values()) {
            if (country.numericCode == numericCode) {
                return country;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", numericCode='" + numericCode + '\'' +
                '}';
    }
}
