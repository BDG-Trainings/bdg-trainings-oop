package com.bdg.aidaghalayan.notification;

import java.util.HashMap;
import java.util.Map;

public class NotificationSenderFactory {


    private final Map<NotificationType, NotificationSender> registry = new HashMap<>(NotificationType.values().length);

    public NotificationSenderFactory() {
        this.registry.put(NotificationType.CALL, CallNotificationSender.getInstance());
        this.registry.put(NotificationType.EMAIL, EmailNotificationSender.getInstance());
        this.registry.put(NotificationType.SMS, MobileSMSNotificationSender.getInstance());
    }

    public NotificationSender getNotification(final NotificationType type) {
        return this.registry.get(type);
    }

    public NotificationSender getNotificationSender(NotificationType notificationType) {
        if (notificationType == NotificationType.CALL) {
            return new CallNotificationSender();
        }
        if (notificationType == NotificationType.SMS) {
            return new MobileSMSNotificationSender();
        }
        if (notificationType == NotificationType.EMAIL) {
            return new EmailNotificationSender();

        }
        return  null;
    }
}
