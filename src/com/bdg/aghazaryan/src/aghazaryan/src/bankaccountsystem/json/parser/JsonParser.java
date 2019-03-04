package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser;


import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.validator.InvalidJsonException;

public interface JsonParser {

    JsonParseResults doParse(String content) throws InvalidJsonException;
}