package com.bdg.vkaramyan.bankaccountsystem;

import com.bdg.vkaramyan.bankaccountsystem.common.Country;
import com.bdg.vkaramyan.bankaccountsystem.common.CountryCode;
import com.bdg.vkaramyan.bankaccountsystem.common.PhoneType;
import com.bdg.vkaramyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.vkaramyan.bankaccountsystem.entity.Address;
import com.bdg.vkaramyan.bankaccountsystem.entity.CreditCard;
import com.bdg.vkaramyan.bankaccountsystem.entity.Customer;
import com.bdg.vkaramyan.bankaccountsystem.entity.PhoneNumber;

public class JsonParser {
	
	private String content;
    private ObjectType objectType;

    public JsonParser(final String jsonContent, ObjectType objectType) {
        this.content = jsonContent;
        this.objectType = objectType;
    }

    public Object parse() {
        switch (this.objectType) {
            case ADDRESS:
                return this.parseAddress();
            case PHONE_NUMBER:
                return this.parsePhoneNumber();
            case ACCOUNT_BALANCE:
                return this.parseAccountBalance();
            default:
                throw new ObjectTypeNotFoundException("Object type : " + objectType + " not found");

        }
    }

    private Address parseAddress() {
        return new Address(1);
    }

    private AccountBalance parseAccountBalance() {
        return null;
    }

    private PhoneNumber parsePhoneNumber() {
        return null;
    }

}
