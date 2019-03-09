package com.bdg.master.address;


import com.bdg.master.bankaccountsystem.PhoneNumber;
import com.bdg.master.bankaccountsystem.PhoneNumberService;
import com.bdg.master.bankaccountsystem.PhoneNumberServiceImpl;
import com.bdg.master.bankaccountsystem.entity.Country;
import com.bdg.master.json.parser.JsonArrayParser;
import com.bdg.master.json.parser.JsonArrayParserImpl;
import com.bdg.master.json.parser.JsonParseResult;
import com.bdg.master.json.parser.JsonParseResults;
import com.bdg.master.json.parser.JsonParser;
import com.bdg.master.json.parser.SimpleJsonParser;

public final class AddressServiceImpl implements AddressService {

    private final PhoneNumberService phoneNumberService = new PhoneNumberServiceImpl();
    private final JsonArrayParser jsonArrayParser = new JsonArrayParserImpl();
    private final JsonParser jsonParser = new SimpleJsonParser();

    @Override
    public Address create(final String addressContent) {

        final Address address = new Address();
        final String[] phoneNumberContents = jsonArrayParser.doParse(addressContent);

        PhoneNumber[] numbers = new PhoneNumber[phoneNumberContents.length];
        int k = 0;
        for (final String pnc : phoneNumberContents) {
            numbers[k] = phoneNumberService.create(pnc);
            k++;
        }
        address.setPhoneNumbers(numbers);

        final JsonParseResults jsonParseResults = jsonParser.doParse(addressContent);
        for (final JsonParseResult jpr : jsonParseResults.getResults()) {
            switch (jpr.getJsonKey()) {
                case "country":
                    address.setCountry(Country.findByName(jpr.getJsonValue()));
                    break;
                case "street":
                    address.setStreet(jpr.getJsonValue());
                    break;
            }
        }

        return address;
    }

    public static void main(String[] args) {
        AddressService addressService = new AddressServiceImpl();
        String content = "{\n" +
                "  \"country\": \"Armenia\",\n" +
                "  \"street\": \"some street\",\n" +
                "  \"phoneNumbers\": [\n" +
                "    {\n" +
                "      \"countryCode\": \"ARM\",\n" +
                "      \"number\": \"091234567\",\n" +
                "      \"phoneType\": \"MOBILE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"countryCode\": \"ARM\",\n" +
                "      \"number\": \"091234567\",\n" +
                "      \"phoneType\": \"WORK\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"countryCode\": \"ARM\",\n" +
                "      \"number\": \"091234567\",\n" +
                "      \"phoneType\": \"HOME\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        Address address = addressService.create(content);
        System.out.println(address);
    }
}
