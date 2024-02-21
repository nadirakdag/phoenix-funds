package dev.nadirakdag.phoenixfunds.application.external;

import org.springframework.stereotype.Service;

@Service
public interface NotificationService {
    boolean send();
}
