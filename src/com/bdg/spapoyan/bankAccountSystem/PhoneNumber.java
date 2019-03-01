package com.bdg.spapoyan.bankAccountSystem;

import com.bdg.spapoyan.bankAccountSystem.enumBankAccountSystem.CountyCode;
import com.bdg.spapoyan.bankAccountSystem.enumBankAccountSystem.PhoneType;

public class PhoneNumber {

    private CountyCode countyCode;
    private String number;
    private PhoneType type;


    public PhoneNumber(CountyCode countyCode, String number, PhoneType type) {
        this.countyCode = countyCode;
        this.number = number;
        this.type = type;
    }
}
