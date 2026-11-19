package es.uca.iw.decadicadi.booking;

import es.uca.iw.decadicadi.notification.NotificationSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookings;
    private final FeeCalculator feeCalculator;
    private final NotificationSender notifier;

    public BookingService(
            BookingRepository bookings,
            FeeCalculator feeCalculator,
            NotificationSender notifier) {
        this.bookings = bookings;
        this.feeCalculator = feeCalculator;
        this.notifier = notifier;
    }

    public Booking book(
            String member,
            String court,
            LocalDateTime start,
            int hours) {

        if (start.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException(
                    "Start time is in the past");
        }

        Booking booking = new Booking(
                member,
                court,
                start,
                feeCalculator.calculate(hours)
        );

        notifier.send(
                member,
                "Booking confirmed: " + court
        );

        return bookings.save(booking);
    }

    public List<Booking> findAll() {
        return bookings.findAll();
    }
}