package com.bdg.aidaghalayan.notification;


/**
 * @author William Arustamyan
 */


public final class Notification {

    private String message;
    private String receiver;
    private String  emailAddress;
    private Integer x;

    public Notification(final String message) {
        this.message = message;
        x.toString();
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
