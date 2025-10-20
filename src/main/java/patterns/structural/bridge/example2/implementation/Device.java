package patterns.structural.bridge.example2.implementation;

public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    boolean isOn();
}
