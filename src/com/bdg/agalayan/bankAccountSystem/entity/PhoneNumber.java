package com.bdg.agalayan.bankAccountSystem.entity;

import com.bdg.agalayan.bankAccountSystem.enums.CountryCode;
import com.bdg.agalayan.bankAccountSystem.enums.PhoneType;


//We don't need a getter setter in this class
//Phone number class is entity so should be extends from AbstractBankEntity
public class PhoneNumber extends AbstractBankEntity{
    private final CountryCode countryCode;
    private final String number;
    private final PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type) {

        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }
    @Override
    public String toString(){
        return "CountryCode:"+ countryCode+
                ", PhonType:"+type+
                ", number:" +number+ "]";
    }

}
