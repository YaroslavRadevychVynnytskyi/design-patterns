package patterns.behavioral.mediator.example2.mediator;

import patterns.behavioral.mediator.example2.device.HomeMode;
import patterns.behavioral.mediator.example2.device.SmartDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartHomeHub implements SmartHomeMediator {
    private Map<String, SmartDevice> devices;
    private List<String> eventLog;
    private HomeMode currentMode;
    private boolean automaticEnabled;

    public SmartHomeHub() {
        this.devices = new HashMap<>();
        this.eventLog = new ArrayList<>();
        this.currentMode = HomeMode.HOME;
        this.automaticEnabled = true;
    }

    @Override
    public void registerDevice(SmartDevice device) {
        devices.put(device.getId(), device);
    }

    @Override
    public void notify(SmartDevice device, String event, Object data) {

    }

    @Override
    public void setHomeMode(HomeMode mode) {
        currentMode = mode;
    }

    public void showStatus() {
        devices.values().forEach(d -> System.out.println(d.getStatus()));
    }

    private void logEvent(String event) {
        String timestamp = java.time.LocalTime.now().toString();
        eventLog.add("[" + timestamp + "] " + event);

        if (eventLog.size() > 10) {
            eventLog.remove(0);
        }
    }
}
