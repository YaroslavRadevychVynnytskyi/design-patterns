package patterns.behavioral.observer.example1.observer;

import java.math.BigDecimal;

public class AlertSystem implements WeatherObserver {
    @Override
    public void update(BigDecimal temperature, BigDecimal humidity) {
        System.out.println("======Alert system======");
        if (BigDecimal.valueOf(35).compareTo(temperature) < 0) {
            System.out.println("Warning! The temperature is more that 35°C");
        }
    }
}
