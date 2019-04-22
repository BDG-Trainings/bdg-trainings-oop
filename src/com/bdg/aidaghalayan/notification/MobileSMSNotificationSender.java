package com.bdg.aidaghalayan.notification;

public class MobileSMSNotificationSender implements NotificationSender {

    private static MobileSMSNotificationSender mobileSMSNotificationSenderInstance= new MobileSMSNotificationSender();

    private MobileSMSNotificationSender() {
    }
    public static MobileSMSNotificationSender getInstance(){
        return mobileSMSNotificationSenderInstance;
    }
}
