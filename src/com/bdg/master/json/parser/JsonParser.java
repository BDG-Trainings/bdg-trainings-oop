package com.bdg.master.json.parser;


import com.bdg.master.json.validator.InvalidJsonException;

public interface JsonParser {

    JsonParseResults doParse(String content) throws InvalidJsonException;
}
