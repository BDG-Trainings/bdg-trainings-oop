package com.bdg.osahakyan.json.enums;

public enum CountryCode {

    ARM(Country.AM);

    private Country country;


    CountryCode(Country country) {
        this.country = country;
    }
}
