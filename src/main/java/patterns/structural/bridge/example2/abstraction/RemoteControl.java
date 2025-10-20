package patterns.structural.bridge.example2.abstraction;

import patterns.structural.bridge.example2.implementation.Device;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void volumeUp();
    public abstract void volumeDown();
}
