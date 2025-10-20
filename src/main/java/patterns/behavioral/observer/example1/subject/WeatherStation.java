package patterns.behavioral.observer.example1.subject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import patterns.behavioral.observer.example1.observer.WeatherObserver;

public class WeatherStation implements WeatherSubject {
    private final List<WeatherObserver> observers = new ArrayList<>();
    private BigDecimal temperature;
    private BigDecimal humidity;

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, humidity));
    }

    public void setMeasurements(BigDecimal temperature, BigDecimal humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
