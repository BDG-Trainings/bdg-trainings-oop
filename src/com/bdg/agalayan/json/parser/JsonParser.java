package com.bdg.agalayan.json.parser;


import com.bdg.agalayan.json.validator.InvalidJsonException;

public interface JsonParser {

    JsonParseResults doParse(String content) throws InvalidJsonException;
}
