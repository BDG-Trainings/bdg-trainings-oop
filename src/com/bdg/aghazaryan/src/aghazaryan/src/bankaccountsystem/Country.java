package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem;

public enum Country {
    AM( "Armenia", "051"),
    USA("New York", "10003"),
    UK("London", "SW8 3NS"),
    IT("Florence", "50123"),
    FR("Nice", "06200");

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
