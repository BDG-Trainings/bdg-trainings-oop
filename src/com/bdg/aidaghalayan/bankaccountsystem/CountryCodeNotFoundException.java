package com.bdg.aidaghalayan.bankaccountsystem;


public class CountryCodeNotFoundException extends RuntimeException {


    private static final String DEFAULT_NOT_FOUND_MESSAGE = "Country Code %s not found";
    private final String message;

    public CountryCodeNotFoundException(final String message) {
        this.message = String.format(DEFAULT_NOT_FOUND_MESSAGE, message);
    }

    public String getMessage() {
        return this.message;
    }
}
