package com.bdg.aidaghalayan.bankaccountsystem;


import com.bdg.aidaghalayan.json.parser.JsonParseResult;
import com.bdg.aidaghalayan.json.parser.JsonParseResults;
import com.bdg.aidaghalayan.json.parser.JsonParser;
import com.bdg.aidaghalayan.json.parser.SimpleJsonParser;

/**
 * Phone number service class to provide base CRUD functionality
 */
public final class PhoneNumberServiceImpl implements PhoneNumberService {

    private final JsonParser phoneNumberJsonParser = new SimpleJsonParser();


    /**
     * @param jsonPhoneNumberContent PhoneNumber json representation
     * @return PhoneNumber entity.
     */
    @Override
    public PhoneNumber create(final String jsonPhoneNumberContent) {

        final JsonParseResults results = phoneNumberJsonParser.doParse(jsonPhoneNumberContent);
        final PhoneNumber phoneNumber = new PhoneNumber();

        for (final JsonParseResult jpr : results.getResults()) {
            switch (jpr.getJsonKey()) {
                case "countryCode":
                    phoneNumber.setCountryCode(CountryCode.findByCountryCode(jpr.getJsonValue()));
                    break;
                case "number":
                    phoneNumber.setNumber(jpr.getJsonValue());
                    break;
                case "phoneType":
                    phoneNumber.setPhoneType(PhoneType.findByPhoneTypeName(jpr.getJsonValue()));
                    break;
            }
        }

        return phoneNumber;
    }

    public static void main(String[] args) {
        final PhoneNumberService phoneNumberService = new PhoneNumberServiceImpl();
        final String content = "{\n" +
                "  \"countryCode\": \"ARM\",\n" +
                "  \"number\": \"091234567\",\n" +
                "  \"phoneType\": \"Mobile\"\n" +
                "}";

        final PhoneNumber phoneNumber = phoneNumberService.create(content);
        System.out.println(phoneNumber);
    }
}
