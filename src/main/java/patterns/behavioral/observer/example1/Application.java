package patterns.behavioral.observer.example1;

import java.math.BigDecimal;
import java.util.List;

import patterns.behavioral.observer.example1.observer.AlertSystem;
import patterns.behavioral.observer.example1.observer.GnomeWidget;
import patterns.behavioral.observer.example1.observer.PhoneDisplay;
import patterns.behavioral.observer.example1.observer.WeatherObserver;
import patterns.behavioral.observer.example1.subject.WeatherStation;

public class Application {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        List<WeatherObserver> observers = List.of(new AlertSystem(), new PhoneDisplay(), new GnomeWidget());
        observers.forEach(station::addObserver);

        station.setMeasurements(BigDecimal.valueOf(5), BigDecimal.valueOf(56));
        System.out.println();

        station.setMeasurements(BigDecimal.valueOf(3), BigDecimal.valueOf(68));
        System.out.println();

        station.setMeasurements(BigDecimal.valueOf(36), BigDecimal.valueOf(74));
        System.out.println();

        station.removeObserver(observers.getFirst());

        station.setMeasurements(BigDecimal.valueOf(13), BigDecimal.valueOf(20));
        System.out.println();

        station.setMeasurements(BigDecimal.valueOf(12), BigDecimal.valueOf(34));
        System.out.println();

        station.setMeasurements(BigDecimal.valueOf(20), BigDecimal.valueOf(23));
    }
}
