package com.bdg.osahakyan.bankaccountsystem.enums;

public enum  CountryCode {

//source--> https://countrycode.org/

    ARM("+374", "Armenia"),
    USA("+1", "United States of America" ),
    CHN("+86", "China");

    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }
}
