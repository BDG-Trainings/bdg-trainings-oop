package com.bdg.hhertevtsyan.bankaccountsystem.json.validator;

public interface JsonValidator {

    /**
     * @param content to validate
     */
    void validate(String content) throws InvalidJsonException;
}