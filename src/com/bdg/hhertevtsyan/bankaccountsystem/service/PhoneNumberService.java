package com.bdg.hhertevtsyan.bankaccountsystem.service;

import com.bdg.hhertevtsyan.bankaccountsystem.entity.PhoneNumber;

public interface PhoneNumberService {
    PhoneNumber create (String PhoneNumberJson);
    PhoneNumber update (String PhoneNumberJson);
    PhoneNumber delete (String PhoneNumberJson);
}
