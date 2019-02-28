package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.enums;

public enum Country {
    ARM( "Armenia", "051"),
    USA("USA", "10003"),
    UK("United Kingdom", "SW8 3NS"),
    IT("Italy", "50123"),
    FR("France", "06200");

    private final String countryName;
    private final String numericCode;

    Country(final String countryName, final String countryCapital){
        this.countryName = countryName;
        this.numericCode = countryCapital;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCapital() {
        return numericCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", numericCode='" + numericCode + '\'' +
                '}';
    }
}
