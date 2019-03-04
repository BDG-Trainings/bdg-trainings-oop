package com.bdg.akarapetyan.bankaccountsystem;

public final class PhoneNumber {

    private PhoneType phoneType;
    private String number;
    private CountryCode countryCode;


    public PhoneNumber(final PhoneType phoneType, final String number, final CountryCode countryCode) {
        this.phoneType = phoneType;
        this.number = number;
        this.countryCode = countryCode;
    }

    public PhoneNumber() {
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public String getNumber() {
        return number;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setPhoneType(final PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public void setCountryCode(final CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneType=" + phoneType +
                ", number='" + number + '\'' +
                ", countryCode=" + countryCode +
                '}';
    }
}