package com.bdg.osahakyan.bankaccountsystem;

import com.bdg.osahakyan.bankaccountsystem.enums.CountryCode;
import com.bdg.osahakyan.bankaccountsystem.enums.PhoneType;

public class PhoneNumber {

    private CountryCode countryCode;
    private String number;
    private PhoneType phoneType;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType phoneType) {
        this.countryCode = countryCode;
        this.number = number;
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
