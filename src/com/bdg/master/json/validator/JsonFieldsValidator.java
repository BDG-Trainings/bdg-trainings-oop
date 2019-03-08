package com.bdg.master.json.validator;


/**
 * JsonFieldsValidator class
 * Validates content field formatting
 */
public final class JsonFieldsValidator implements JsonValidator {


    private static final String TWO_DOTS = ":";
    private static final String OPEN_BRACKETS = "{";
    private static final String CLOSE_BRACKETS = "}";
    private static final String OPEN_ARRAY_BRACKETS = "[";
    private static final String COMMA = ",";

    /**
     * @param content to validate.
     * @throws InvalidJsonException if json key or value missing.
     */
    @Override
    public void validate(final String content) throws InvalidJsonException {
        String withoutBrackets = content.replace(OPEN_BRACKETS, "").replace(CLOSE_BRACKETS, "");
        int commaCount = withoutBrackets.split(COMMA).length;
        int twoDotCount = content.length() - content.replace(TWO_DOTS, "").length();
        if (!withoutBrackets.contains(OPEN_ARRAY_BRACKETS)) {
            if (commaCount != twoDotCount) throw new InvalidJsonException("Key : Value field count does not match ...");
        }
    }
}
