package dev.nadirakdag.phoenixfunds.infrastructure.notification;

import dev.nadirakdag.phoenixfunds.application.external.NotificationService;

public class ExternalNotificationService implements NotificationService {

    @Override
    public boolean send() {
        return false;
    }
}
