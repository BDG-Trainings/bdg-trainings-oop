package com.bdg.aidaghalayan.json.parser;


import com.bdg.aidaghalayan.json.validator.InvalidJsonException;

public interface JsonParser {

    JsonParseResults doParse(String content) throws InvalidJsonException;
}
