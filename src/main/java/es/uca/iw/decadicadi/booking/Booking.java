package es.uca.iw.decadicadi.booking;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Booking {

    private final UUID id = UUID.randomUUID();
    private final String memberName;
    private final String courtName;
    private final LocalDateTime start;
    private final BigDecimal fee;

    public Booking(String memberName, String courtName,
                   LocalDateTime start, BigDecimal fee) {
        this.memberName = memberName;
        this.courtName = courtName;
        this.start = start;
        this.fee = fee;
    }

    public UUID getId() {
        return id;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getCourtName() {
        return courtName;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public BigDecimal getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", memberName='" + memberName + '\'' +
                ", courtName='" + courtName + '\'' +
                ", start=" + start +
                ", fee=" + fee +
                '}';
    }
}