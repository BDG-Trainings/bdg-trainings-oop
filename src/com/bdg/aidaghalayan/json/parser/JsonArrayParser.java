package com.bdg.aidaghalayan.json.parser;


import com.bdg.aidaghalayan.json.validator.InvalidJsonException;

public interface JsonArrayParser {

    String[] doParse(String content) throws InvalidJsonException;
}
