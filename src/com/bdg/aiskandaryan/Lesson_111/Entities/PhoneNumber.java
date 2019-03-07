package com.bdg.aiskandaryan.Lesson_111.Entities;

public class PhoneNumber {
    private PhoneCountryCode phoneCountryCode;
    private PhoneType phoneType;
    private String number;

    public PhoneNumber(final PhoneCountryCode phoneCountryCode, final PhoneType phoneType, final String number) {
        this.phoneCountryCode = phoneCountryCode;
        this.phoneType = phoneType;
        this.number = number;
    }

    public PhoneCountryCode getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(final PhoneCountryCode phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(final PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneCountryCode=" + phoneCountryCode +
                ", phoneType=" + phoneType +
                ", number='" + number + '\'' +
                '}';
    }
}
