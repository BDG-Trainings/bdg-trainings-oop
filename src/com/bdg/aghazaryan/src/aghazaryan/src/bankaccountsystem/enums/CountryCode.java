package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.enums;

public enum CountryCode {

    ARM("+374", Country.ARM),
    USA("+1",Country.USA),
    UK("+44", Country.UK),
    IT("+39",Country.IT),
    FR("+33", Country.FR);


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
