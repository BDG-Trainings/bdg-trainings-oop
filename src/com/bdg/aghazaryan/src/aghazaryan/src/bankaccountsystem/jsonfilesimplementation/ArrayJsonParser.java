package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.jsonfilesimplementation;

import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.PhoneNumber;
import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser.JsonParseResults;
import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser.JsonParser;
import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser.SimpleJsonParser;

public class ArrayJsonParser {


    String jsonString = "{\"countryCode\" : \"ARM\",\"number\" : \"091234567\","
            + "\"phoneType\" : \"MOBILE\",}}";


    public ArrayJsonParser(String jsonString) {
        this.jsonString = jsonString;
    }
    private final JsonParser AddressJsonParser = new SimpleJsonParser();

    public PhoneNumber create(final String jsonAddressContent) {
        final JsonParseResults results =  AddressJsonParser.doParse(jsonAddressContent);
        final ArrayJsonParser ArrayJsonParser = new ArrayJsonParser(jsonString);
        return null;

    }

}
