package com.bdg.aidaghalayan.notification;


/**
 * @author William Arustamyan
 */


public class NotificationSenderNotFoundException extends RuntimeException {

    private NotificationType type;

    public NotificationSenderNotFoundException(NotificationType type) {
        this.type = type;
    }

    @Override
    public String getMessage() {
        return "Notification with type : " + this.type + " not found...";
    }
}
