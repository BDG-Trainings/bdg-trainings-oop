package com.bdg.vkaramyan.bankaccountsystem.common;

public class PhoneTypeNotFoundException extends RuntimeException{
	
	private static final String DEFAULT_NOT_FOUND_MESSAGE = "Phone Type %s not found";
    private final String message;

    public PhoneTypeNotFoundException(final String message) {
        this.message = String.format(DEFAULT_NOT_FOUND_MESSAGE, message);
    }

    public String getMessage() {
        return this.message;
    }

}
