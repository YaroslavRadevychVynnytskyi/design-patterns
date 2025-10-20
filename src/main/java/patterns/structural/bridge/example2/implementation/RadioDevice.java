package patterns.structural.bridge.example2.implementation;

public class RadioDevice implements Device {
    private boolean on;
    private int volume = 50;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is now ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is now ON");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume is set to " + volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }

    public int getVolume() {
        return volume;
    }
}
