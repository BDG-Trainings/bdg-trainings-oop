package com.bdg.agalayan.bankAccountSystem.enums;

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

    public  Country findByCountryName(final String countryName) {
        for(Country c : Country.values()){
            if(c.getCountryName().equals(countryName)){
                return c;
            }
        }
        return null;
    }

    public Country findByNumericCode(final String numericCode) {
        for(Country c: Country.values()){
            if(c.getCountryName().equals(numericCode)){
                return c;
            }
        }
        return null;
    }




    @Override
    public String toString() {
        return "Country [name = " + getCountryName() + "," + "numericCode = " + getNumericCode() + "]";
    }
}
