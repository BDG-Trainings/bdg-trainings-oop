package com.bdg.master.json.validator;


/**
 * JsonValidator  interface.
 * <p>
 * Accept Json String content as parameter and validate it.
 * If content is invalid then throws InvalidJsonException
 */
public interface JsonValidator {

    /**
     * @param content to validate
     */
    void validate(String content) throws InvalidJsonException;
}
