package patterns.behavioral.observer.example1.observer;

import java.math.BigDecimal;

public interface WeatherObserver {
    void update(BigDecimal temperature, BigDecimal humidity);
}
