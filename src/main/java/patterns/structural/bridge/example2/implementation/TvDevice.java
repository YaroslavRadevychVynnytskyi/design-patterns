package patterns.structural.bridge.example2.implementation;

public class TvDevice implements Device {
    private boolean on;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV in now OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume is set to " + volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }

    public int getVolume() {
        return volume;
    }
}
