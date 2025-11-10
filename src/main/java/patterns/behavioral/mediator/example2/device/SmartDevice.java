package patterns.behavioral.mediator.example2.device;

import lombok.Getter;
import lombok.Setter;
import patterns.behavioral.mediator.example2.mediator.SmartHomeMediator;

@Getter
@Setter
public abstract class SmartDevice {
    protected SmartHomeMediator mediator;
    protected String id;
    protected String location;
    protected boolean enabled;
    protected int batteryLevel;

    protected SmartDevice(SmartHomeMediator mediator, String id, String location) {
        this.mediator = mediator;
        this.id = id;
        this.location = location;
        this.enabled = true;
        this.batteryLevel = -1;
    }

    // Notify mediator about event
    protected void sendEvent(String event, Object data) {
        if (mediator != null) {
            mediator.notify(this, event, data);
        }
    }

    public abstract String getStatus();
}
