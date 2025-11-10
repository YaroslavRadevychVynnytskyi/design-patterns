package patterns.behavioral.mediator.example2.device;

import patterns.behavioral.mediator.example2.mediator.SmartHomeMediator;

public class SmartLight extends SmartDevice {
    private boolean isOn;
    private int brightness;
    private String color;

    public SmartLight(SmartHomeMediator mediator, String id, String location) {
        super(mediator, id, location);
        this.isOn = false;
        this.brightness = 100;
        this.color = "white";
    }

    public void turnOn() {
        if (!enabled) return;
        if (isOn) {
            System.out.println("❌ " + id + ": Can't turn on - the light is already turned on");
            return;
        }
        isOn = true;
        System.out.println("\uD83D\uDCA1" + id + " (" + location + "): Light is turned on");
        sendEvent("light_turned_on", null);
    }

    public void turnOff() {
        if (!enabled) return;
        if (!isOn) {
            System.out.println("❌ " + id + ": Can't turn off - the light is already turned off");
            return;
        }
        isOn = false;
        System.out.println("\uD83D\uDCA1" + id + " (" + location + "): Light is turned off");
        sendEvent("light_turned_off", null);
    }

    public void setBrightness(int level) {
        if (level < 0 || level > 100) return;
        this.brightness = level;

        System.out.println("\uD83D\uDCA1" + id + " (" + location + "): Light brightness is set to " + level);
        sendEvent("light_brightness_adjusted", null);
    }

    @Override
    public String getStatus() {
        return String.format("%s (%s): %s, brightness: %d%%, color: %s",
                id, location,
                isOn ? "turned_on" : "turned_off",
                brightness, color);
    }
}
