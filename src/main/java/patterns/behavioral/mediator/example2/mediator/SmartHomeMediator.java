package patterns.behavioral.mediator.example2.mediator;

import patterns.behavioral.mediator.example2.device.HomeMode;
import patterns.behavioral.mediator.example2.device.SmartDevice;

public interface SmartHomeMediator {
    void registerDevice(SmartDevice device);
    void notify(SmartDevice device, String event, Object data);
    void setHomeMode(HomeMode mode);
}
