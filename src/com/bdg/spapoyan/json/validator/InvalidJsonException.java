package com.bdg.spapoyan.json.validator;

public class InvalidJsonException extends Exception {


    private String message;
    private static final String INVALID_JSON_PREFIX = "Invalid Json format : %s";

    public InvalidJsonException(final String message) {
        this.message = message;
    }


    public String getMessage() {
        return String.format(INVALID_JSON_PREFIX, this.message);
    }


}
