package com.bdg.resourcemanagement.aghazaryan;

public enum Country {

    RU("Russia", "Moscow"),
    AM("Armenia", "Yerevan"),
    US("USA", "New York");

    private final String countryName;
    private final String city;

    Country(String countryName, String city) {
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
