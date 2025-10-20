package patterns.behavioral.observer.example1.observer;

import java.math.BigDecimal;

public class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(BigDecimal temperature, BigDecimal humidity) {
        System.out.println("======Phone Display======");
        System.out.printf("Weather updated. Temp: %s, Humidity: %s\n", temperature, humidity);
    }
}
