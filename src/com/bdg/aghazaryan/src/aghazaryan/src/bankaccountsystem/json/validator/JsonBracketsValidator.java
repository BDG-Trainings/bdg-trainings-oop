package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.validator;

/**
 * JsonBracketsValidator class.
 * Validate brackets in json string content.
 */
public final class JsonBracketsValidator implements JsonValidator {

    private static final String OPEN_BRACKETS = "{";
    private static final String CLOSE_BRACKETS = "}";

    /**
     * @param content to validate
     * @throws InvalidJsonException if json open and close brackets does not match
     */
    @Override
    public void validate(final String content) throws InvalidJsonException {

        int openBracketCount = content.length() - content.replace(OPEN_BRACKETS, "").length();
        int closeBracketCount = content.length() - content.replace(CLOSE_BRACKETS, "").length();

        if (openBracketCount != closeBracketCount) throw new InvalidJsonException("Open and Close brackets count does not match ... ");

    }
}