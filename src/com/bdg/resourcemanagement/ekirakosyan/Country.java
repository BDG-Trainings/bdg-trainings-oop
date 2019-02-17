package com.bdg.resourcemanagement.ekirakosyan;

public enum Country {

    AF("Afghanistan", "Kabul"),
    AM("Armenia", "Yerevan"),
    FR("France", "Paris"),
    IT("Italy", "Rome"),
    RU("Russia", "Moscow"),
    US("United States of America", "Washington");

    private final String countryName;
    private final String countryCapital;

    Country(final String countryName, final String countryCapital){
        this.countryName = countryName;
        this.countryCapital = countryCapital;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }
}
