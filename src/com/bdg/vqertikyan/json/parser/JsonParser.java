package com.bdg.vqertikyan.json.parser;


import com.bdg.vqertikyan.json.validator.InvalidJsonException;

public interface JsonParser {

    JsonParseResults doParse(String content) throws InvalidJsonException;
}
