package com.bdg.vkaramyan.bankaccountsystem.json;

import com.bdg.vkaramyan.bankaccountsystem.validator.InvalidJsonException;

public interface JsonParser {
	
	JsonParseResults doParse(String content) throws InvalidJsonException;

}
