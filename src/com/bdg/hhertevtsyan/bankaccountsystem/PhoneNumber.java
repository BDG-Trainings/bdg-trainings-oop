package com.bdg.hhertevtsyan.bankaccountsystem;

import com.bdg.hhertevtsyan.bankaccountsystem.common.CountryCode;
import com.bdg.hhertevtsyan.bankaccountsystem.common.PhoneType;

public class PhoneNumber {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber (final CountryCode countryCode, final String number, final PhoneType type) {
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }
}
