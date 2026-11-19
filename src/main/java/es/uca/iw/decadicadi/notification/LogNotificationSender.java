package es.uca.iw.decadicadi.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LogNotificationSender implements NotificationSender {

    private static final Logger log =
            LoggerFactory.getLogger(LogNotificationSender.class);

    @Override
    public void send(String recipient, String message) {
        log.info("To {}: {}", recipient, message);
    }
}