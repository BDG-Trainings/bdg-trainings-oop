package com.bdg.osahakyan.json.enums;

public enum Country {

    AM("Armenia"),
    CA("Canada"),
    EC("Ecuador");

    private String countryName;


    Country(String countryName) {
        this.countryName = countryName;
    }
}
