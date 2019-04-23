package com.bdg.aidaghalayan.notification;

public class CallNotificationSender implements NotificationSender {

    private static CallNotificationSender callNotificationSenderInstance = new CallNotificationSender();

    CallNotificationSender() {
    }

    public static CallNotificationSender getInstance(){
        return callNotificationSenderInstance;
    }

    @Override
    public void send(Notification notification) {

    }
}
