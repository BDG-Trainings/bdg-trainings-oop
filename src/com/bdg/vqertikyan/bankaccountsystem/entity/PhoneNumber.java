package com.bdg.vqertikyan.bankaccountsystem.entity;

import com.bdg.vqertikyan.bankaccountsystem.common.CountryCode;
import com.bdg.vqertikyan.bankaccountsystem.common.PhoneType;

public class PhoneNumber {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type) {
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
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

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", number='" + number + '\'' +
                ", type=" + type +
                '}';
    }
}