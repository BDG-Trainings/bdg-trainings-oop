package com.bdg.resourcemanagement.spapoyan;

public enum Country {


    AM("Armenia", "Yerevan"),
    RU("Russia", "Moscow"),
    US("United States of America", "Washington"),
    FR("France","Paris"),
    DE("Germany","Berlin"),
    SG("Singapore","Singapore"),
    ES("Spain","Madrid");



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


