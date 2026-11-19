package es.uca.iw.decadicadi;

import es.uca.iw.decadicadi.booking.Booking;
import es.uca.iw.decadicadi.booking.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DemoDataRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(DemoDataRunner.class);

    private final BookingService bookingService;

    public DemoDataRunner(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Override
    public void run(String... args) {

        LocalDateTime tomorrow = LocalDateTime.now()
                .plusDays(1)
                .withHour(18)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);

        bookingService.book("Ana", "Court 1", tomorrow, 1);
        bookingService.book("Luis", "Court 2", tomorrow, 2);

        for (Booking booking : bookingService.findAll()) {
            log.info("Booking: member={}, court={}, start={}, fee={} EUR",
                    booking.getMemberName(),
                    booking.getCourtName(),
                    booking.getStart(),
                    booking.getFee());
        }

        try {
            bookingService.book(
                    "Pedro",
                    "Court 3",
                    LocalDateTime.now().minusDays(1),
                    1
            );
        } catch (IllegalArgumentException e) {
            log.warn("Booking rejected: {}", e.getMessage());
        }
    }
}