package com.bdg.aidaghalayan.notification;

public class MobileSMSNotificationSender implements NotificationSender {

    private static MobileSMSNotificationSender mobileSMSNotificationSenderInstance= new MobileSMSNotificationSender();

    MobileSMSNotificationSender() {
    }


    public static MobileSMSNotificationSender getInstance(){
        return mobileSMSNotificationSenderInstance;
    }

    @Override
    public void send(Notification notification) {

    }
}
