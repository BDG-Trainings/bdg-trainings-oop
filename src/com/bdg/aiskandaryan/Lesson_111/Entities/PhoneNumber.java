package com.bdg.aiskandaryan.Lesson_111.Entities;

public class PhoneNumber {
    private final PhoneCountryCode phoneCountryCode;
    private final PhoneType phoneType;
    private final String number;

    public PhoneNumber(final PhoneCountryCode phoneCountryCode, final PhoneType phoneType, final String number) {
        this.phoneCountryCode = phoneCountryCode;
        this.phoneType = phoneType;
        this.number = number;
    }
}
