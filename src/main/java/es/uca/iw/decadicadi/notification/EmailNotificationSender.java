package es.uca.iw.decadicadi.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotificationSender implements NotificationSender {

    private static final Logger log =
            LoggerFactory.getLogger(EmailNotificationSender.class);

    @Override
    public void send(String recipient, String message) {
        log.info("Sending email to {}: {}", recipient, message);
    }
}