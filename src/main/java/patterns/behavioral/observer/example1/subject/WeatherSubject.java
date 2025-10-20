package patterns.behavioral.observer.example1.subject;

import patterns.behavioral.observer.example1.observer.WeatherObserver;

public interface WeatherSubject {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}
