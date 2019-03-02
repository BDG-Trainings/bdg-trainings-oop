package com.bdg.warustamyan.bankaccountsystem;


import com.bdg.warustamyan.bankaccountsystem.entity.AccountBalance;
import com.bdg.warustamyan.bankaccountsystem.entity.Address;
import com.bdg.warustamyan.bankaccountsystem.entity.PhoneNumber;

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
                throw new ObjectTypeNotFoundException("Object type : " + objectType + " not found");

        }
    }

    private Address parseAddress() {
        return new Address();
    }

    private AccountBalance parseAccountBalance() {
        return null;
    }

    private PhoneNumber parsePhoneNumber() {
        return null;
    }

}
