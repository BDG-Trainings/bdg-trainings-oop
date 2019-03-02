package com.bdg.vqertikyan.bankaccountsystem.json;


import com.bdg.vqertikyan.bankaccountsystem.common.ObjectType;
import com.bdg.vqertikyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.vqertikyan.bankaccountsystem.entity.Address;
import com.bdg.vqertikyan.bankaccountsystem.entity.PhoneNumber;


public final class JsonParser {

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
                return null;
                // implement
        //        throw new ObjectTypeNotFoundException("Object type : " + objectType + " not found");

        }
    }

    private Address parseAddress() {
        // implement
       // return new Address();
        return null;
    }

    private AccountBalance parseAccountBalance() {
        return null;
    }

    private PhoneNumber parsePhoneNumber() {
        return null;
    }

}
