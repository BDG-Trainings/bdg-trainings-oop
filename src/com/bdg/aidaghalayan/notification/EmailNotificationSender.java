package com.bdg.aidaghalayan.notification;

public class EmailNotificationSender implements NotificationSender {
    private static EmailNotificationSender emailNotificationSenderInstance= new EmailNotificationSender();


    EmailNotificationSender() {
    }
    public static EmailNotificationSender getInstance(){
        return emailNotificationSenderInstance;
    }

    @Override
    public void send(Notification notification) {

    }
}
