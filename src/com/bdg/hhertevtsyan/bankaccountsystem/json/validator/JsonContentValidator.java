package com.bdg.hhertevtsyan.bankaccountsystem.json.validator;

public final class JsonContentValidator implements JsonValidator {


    private final JsonValidator[] validators = {new JsonBracketsValidator(), new JsonArrayBracketsValidator(), new JsonFieldsValidator()};

    /**
     * @param content to validate
     * @throws InvalidJsonException if any validation not pass
     */
    @Override
    public void validate(final String content) throws InvalidJsonException {
        for (final JsonValidator validator : this.validators) {
            validator.validate(content);
        }
    }
}