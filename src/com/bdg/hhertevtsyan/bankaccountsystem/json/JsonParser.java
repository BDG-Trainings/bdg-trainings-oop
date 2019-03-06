package com.bdg.hhertevtsyan.bankaccountsystem.json;

import com.bdg.hhertevtsyan.bankaccountsystem.json.validator.InvalidJsonException;

public interface JsonParser {
    JsonParserResults doParse(String content) throws InvalidJsonException;

}
