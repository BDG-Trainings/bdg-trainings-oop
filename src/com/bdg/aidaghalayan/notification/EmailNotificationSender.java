package com.bdg.aidaghalayan.notification;

public class EmailNotificationSender implements NotificationSender {
    private static EmailNotificationSender emailNotificationSenderInstance= new EmailNotificationSender();


    private EmailNotificationSender() {
    }
    public static EmailNotificationSender getInstance(){
        return emailNotificationSenderInstance;
    }
}
