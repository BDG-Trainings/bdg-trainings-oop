package com.bdg.agalayan.bankAccountSystem;

public class PhoneNumber {
    private final CountryCode countryCode ;
    private final String number;
    private final PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type) {
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }
}
