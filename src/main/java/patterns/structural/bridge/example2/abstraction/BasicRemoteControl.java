package patterns.structural.bridge.example2.abstraction;

import patterns.structural.bridge.example2.implementation.Device;

public class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volumeUp() {
        device.setVolume(20);
    }

    @Override
    public void volumeDown() {
        device.setVolume(10);
    }
}
