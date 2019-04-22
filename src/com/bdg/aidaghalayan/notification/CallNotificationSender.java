package com.bdg.aidaghalayan.notification;

public class CallNotificationSender implements NotificationSender {

    private static CallNotificationSender callNotificationSenderInstance = new CallNotificationSender();

    private CallNotificationSender() {
    }

    public static CallNotificationSender getInstance(){
        return callNotificationSenderInstance;
    }
}
