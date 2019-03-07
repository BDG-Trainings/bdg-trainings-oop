package com.bdg.osahakyan.json.classes;

import com.bdg.osahakyan.json.enums.CountryCode;
import com.bdg.osahakyan.json.enums.PhoneType;

public class PhoneNumber {

    private CountryCode countryCode;
    private String number;
    private PhoneType phoneType;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType phoneType) {
        this.countryCode = countryCode;
        this.number = number;
        this.phoneType = phoneType;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", number='" + number + '\'' +
                ", phoneType=" + phoneType +
                '}';
    }
}
