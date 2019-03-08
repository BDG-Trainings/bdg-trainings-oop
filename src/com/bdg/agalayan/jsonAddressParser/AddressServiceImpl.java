package com.bdg.agalayan.jsonAddressParser;

import com.bdg.agalayan.bankAccountSystem.PhoneNumberServiceImpl;
import com.bdg.agalayan.bankAccountSystem.entity.Address;

import com.bdg.agalayan.bankAccountSystem.entity.PhoneNumber;
import com.bdg.agalayan.bankAccountSystem.enums.Country;
import com.bdg.agalayan.json.parser.JsonParseResult;
import com.bdg.agalayan.json.parser.JsonParseResults;
import com.bdg.agalayan.json.parser.JsonParser;
import com.bdg.agalayan.json.parser.SimpleJsonParser;

public class AddressServiceImpl implements AddressService {
    private final JsonParser addressJsonParser=new SimpleJsonParser();



    @Override
    public Address create(String jsonAddressContent) {
        JsonParseResults results = addressJsonParser.doParse(jsonAddressContent);
        Address address = new Address();

        for (JsonParseResult jsonParseResult : results.getResults()) {
            switch (jsonParseResult.getJsonValue()) {
                case "country":
                    address.getCountry().findByCountryName(jsonParseResult.getJsonValue());
                    break;
                case "street":
                    address.setStreet(jsonParseResult.getJsonKey());
                    break;
                case "phoneNumbers":
                    PhoneNumberServiceImpl p = new PhoneNumberServiceImpl();
                    address.setPhoneNumbers(p.create(jsonParseResult.getJsonValue()));
                    break;

            }
        } return address;
        }

    public static void main(String[] args) {
        AddressServiceImpl addressService=new AddressServiceImpl();
        String content="{\n"+
                "\"country\": \"AM\",\n"+
                "\"street\": \"some street\",\n"+
                "\"phoneNumbers\": ["+"}";


}}
