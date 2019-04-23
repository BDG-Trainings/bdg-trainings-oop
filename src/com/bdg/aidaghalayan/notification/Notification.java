package com.bdg.aidaghalayan.notification;


/**
 * @author William Arustamyan
 */


public final class Notification {

    private String message;
    private String receiver;
    private String  emailAddress;

    public Notification(final String message) {
        this.message = message;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String message() {
        return this.message;
    }
}
