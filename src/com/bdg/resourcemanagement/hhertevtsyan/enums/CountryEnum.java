package com.bdg.resourcemanagement.hhertevtsyan.enums;

public enum CountryEnum {
    AM("Armenia", "Yerevan"),
    RU("Russia", "Moscow"),
    US("USA", "Washington"),
    ES ("Spain", "Madrid"),
    IT ("Italy", "Rome");


    private final String countryName;
    private final String city;

    CountryEnum(String countryName, String city) {
        this.countryName = countryName;
        this.city = city;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getCity() {
        return this.city;
    }
}
