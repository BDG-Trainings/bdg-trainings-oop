package com.bdg.aidaghalayan.notification;


/**
 * @author William Arustamyan
 */


public final class Notification {

    private String message;

    public Notification(final String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
