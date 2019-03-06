package com.bdg.hhertevtsyan.bankaccountsystem.entity;

import com.bdg.hhertevtsyan.bankaccountsystem.common.CountryCode;
import com.bdg.hhertevtsyan.bankaccountsystem.common.PhoneType;

public class PhoneNumber extends AbstractBankEntity {
    private CountryCode countryCode;
    private String number;
    private PhoneType type;

    public PhoneNumber (final int id, final CountryCode countryCode, final String number, final PhoneType type) {
        super(id);
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }
}
