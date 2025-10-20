package patterns.behavioral.observer.example1.observer;

import java.math.BigDecimal;

public class GnomeWidget implements WeatherObserver {
    @Override
    public void update(BigDecimal temperature, BigDecimal humidity) {
        System.out.println("======Gnome Widget======");
        System.out.printf("Weather updated. Temp: %s, Humidity: %s\n", temperature, humidity);
    }
}
