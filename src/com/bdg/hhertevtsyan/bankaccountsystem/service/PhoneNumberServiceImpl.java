package com.bdg.hhertevtsyan.bankaccountsystem.service;

import com.bdg.hhertevtsyan.bankaccountsystem.common.CountryCode;
import com.bdg.hhertevtsyan.bankaccountsystem.common.PhoneType;
import com.bdg.hhertevtsyan.bankaccountsystem.entity.PhoneNumber;
import com.bdg.hhertevtsyan.bankaccountsystem.json.JsonParser;
import com.bdg.hhertevtsyan.bankaccountsystem.json.JsonParserResults;
import com.bdg.hhertevtsyan.bankaccountsystem.json.SimpleJsonParser;

public final class PhoneNumberServiceImpl implements PhoneNumberService {
    private int id =0;
    @Override
    public PhoneNumber create(String PhoneNumberJson) {
        JsonParser parser = new SimpleJsonParser();
        JsonParserResults jsonParserResults = parser.doParse(PhoneNumberJson);
        String[] string = new String[jsonParserResults.length()];
        for (int i = 0; i < string.length; i++) {
            string[i] = jsonParserResults.getResults()[i].getJsonValue();
            System.out.println(string[i]);
        }

        PhoneNumber phoneNumber = new PhoneNumber(id, CountryCode.valueOf(string[0]), string[1], PhoneType.valueOf(string[2]));
        id++;
        return phoneNumber;
    }

    @Override
    public PhoneNumber update(String PhoneNumberJson) {
        return null;
    }

    @Override
    public PhoneNumber delete(String PhoneNumberJson) {
        return null;
    }
}
