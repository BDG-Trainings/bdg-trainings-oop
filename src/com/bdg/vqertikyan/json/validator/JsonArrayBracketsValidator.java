package com.bdg.master.json.validator;


/**
 * JsonArrayBracketsValidator class.
 * Array type brackets validator class
 */
public final class JsonArrayBracketsValidator implements JsonValidator {


    private static final String OPEN_ARRAY_BRACKETS = "[";
    private static final String CLOSE_ARRAY_BRACKETS = "]";

    /**
     * @param content to validate
     * @throws InvalidJsonException if Array type brackets is not valid formatted.
     */
    @Override
    public void validate(final String content) throws InvalidJsonException {
        int openArrayBracketCount = content.length() - content.replace(OPEN_ARRAY_BRACKETS, "").length();
        int closeArrayBracketCount = content.length() - content.replace(CLOSE_ARRAY_BRACKETS, "").length();

        if (openArrayBracketCount != closeArrayBracketCount) throw new InvalidJsonException("Open and Close Array type brackets count does not match ... ");
    }
}
