package es.uca.iw.decadicadi.notification;

public interface NotificationSender {

    void send(String recipient, String message);
}