package com.bdg.warustamyan.bankaccountsystem.entity;


import com.bdg.warustamyan.bankaccountsystem.common.CountryCode;
import com.bdg.warustamyan.bankaccountsystem.common.PhoneType;

public final class PhoneNumber extends AbstractBankEntity {

    private CountryCode countryCode;
    private String number;
    private PhoneType phoneType;

    public PhoneNumber(final CountryCode countryCode, final String number, final PhoneType phoneType) {
        this.countryCode = countryCode;
        this.number = number;
        this.phoneType = phoneType;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(final PhoneType phoneType) {
        this.phoneType = phoneType;
    }
}
