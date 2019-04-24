package com.bdg.aidaghalayan.notification;


/**
 * @author William Arustamyan
 */


public class App {

    public static void main(String[] args) throws NotificationSendException {
        NotificationSenderFactory factory = new NotificationSenderFactory();

        NotificationSender sender = factory.getNotification(NotificationType.PUSH);

        if (sender != null) {
           sender.send(new Notification("FFF"));
        } else {
            System.out.println("Notification with type : " + NotificationType.PUSH + " not found...");
        }
    }
}
