package com.bdg.master.json.parser;


import com.bdg.master.json.validator.InvalidJsonException;

public interface JsonArrayParser {

    String[] doParse(String content) throws InvalidJsonException;
}
