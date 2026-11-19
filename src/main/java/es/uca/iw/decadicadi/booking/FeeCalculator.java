package es.uca.iw.decadicadi.booking;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class FeeCalculator {

    private final BigDecimal hourlyPrice;

    public FeeCalculator(
            @Value("${club.hourly-price}") BigDecimal hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    public BigDecimal calculate(int hours) {
        return hourlyPrice.multiply(BigDecimal.valueOf(hours));
    }
}