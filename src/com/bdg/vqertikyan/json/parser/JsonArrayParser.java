package com.bdg.vqertikyan.json.parser;


import com.bdg.vqertikyan.json.validator.InvalidJsonException;

public interface JsonArrayParser {

    String[] doParse(String content) throws InvalidJsonException;
}
