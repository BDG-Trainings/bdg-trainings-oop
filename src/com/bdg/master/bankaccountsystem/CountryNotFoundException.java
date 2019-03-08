package com.bdg.master.bankaccountsystem;


public class CountryNotFoundException extends RuntimeException {


    private static final String DEFAULT_NOT_FOUND_MESSAGE = "Country %s not found";
    private final String message;

    public CountryNotFoundException(final String message) {
        this.message = String.format(DEFAULT_NOT_FOUND_MESSAGE, message);
    }

    public String getMessage() {
        return this.message;
    }
}
