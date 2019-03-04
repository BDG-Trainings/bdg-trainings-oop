package com.bdg.vkaramyan.bankaccountsystem.service;

import com.bdg.vkaramyan.bankaccountsystem.JsonParser;
import com.bdg.vkaramyan.bankaccountsystem.common.CountryCode;
import com.bdg.vkaramyan.bankaccountsystem.common.PhoneType;
import com.bdg.vkaramyan.bankaccountsystem.entity.PhoneNumber;
import com.bdg.vkaramyan.bankaccountsystem.json.JsonParseResult;
import com.bdg.vkaramyan.bankaccountsystem.json.JsonParseResults;
import com.bdg.vkaramyan.bankaccountsystem.json.SimpleJsonParser;

/**
 * Phone number service class to provide base CRUD functionality
 */


public class PhoneNumberServiceImpl implements PhoneNumberService{
	
	

	    private final SimpleJsonParser phoneNumberJsonParser = new SimpleJsonParser();


	    /**
	     * @param jsonPhoneNumberContent PhoneNumber json representation
	     * @return PhoneNumber entity.
	     */
	    @Override
	    public PhoneNumber create(final String jsonPhoneNumberContent) {

	        final JsonParseResults results = phoneNumberJsonParser.doParse(jsonPhoneNumberContent);
	        final PhoneNumber phoneNumber = new PhoneNumber(1, CountryCode.ARM, "123456789", PhoneType.Mobile);

	        for (final JsonParseResult jpr : results.getResults()) {
	            switch (jpr.getJsonKey()) {
	                case "countryCode":
	                    phoneNumber.setCountryCode(CountryCode.findByCountryCode(jpr.getJsonValue()));
	                    break;
	                case "number":
	                    phoneNumber.setNumber(jpr.getJsonValue());
	                    break;
	                case "phoneType":
	                    phoneNumber.setType(PhoneType.findByPhoneTypeName(jpr.getJsonValue()));
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
