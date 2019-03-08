package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.jsonfilesimplementation;

import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser.JsonParseResult;
import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser.JsonParseResults;
import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser.JsonParser;
import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser.SimpleJsonParser;

public class AddressServiceImpl {


    @Override
    public Address create(final String jsonAddressContent) {

        final JsonParseResults results = ArrayJsonParser.doParse(jsonAddressContent);
        final Address address = new Address();

        for (final JsonParseResult jpr : results.getResults()) {
            switch (jpr.getJsonKey()) {
                case "countryCode":
                    address.setCountryCode(CountryCode.findByCountryCode(jpr.getJsonValue()));
                    break;
                case "number":
                    address.setNumber(jpr.getJsonValue());
                    break;
                case "phoneType":
                    address.setPhoneType(PhoneType.findByPhoneTypeName(jpr.getJsonValue()));
                    break;
            }
        }

        return Address;
    }

}