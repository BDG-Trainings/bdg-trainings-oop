package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.enums;

public enum CountryCode {
//throws an error
    ARM("+374", "Armenia"),
    USA("+1","USA"),
    UK("+44", "United Kingdom"),
    IT("+39","Italy"),
    FR("+33", "France");

    private final String countryCode;
    private final Country country;

    CountryCode (final String countryCode, final Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryCode + '\'' +
                ", countryCapital='" + country + '\'' +
                '}';
    }
}
