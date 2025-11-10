package patterns.behavioral.mediator.example2;

import lombok.SneakyThrows;
import patterns.behavioral.mediator.example2.device.SmartDoor;
import patterns.behavioral.mediator.example2.device.SmartLight;
import patterns.behavioral.mediator.example2.mediator.SmartHomeHub;

public class Application {
    @SneakyThrows
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        SmartDoor frontDoor = new SmartDoor(hub, "entrance_door", "hallway");
        SmartLight smartLight = new SmartLight(hub, "entrance_light", "hallway");

        hub.registerDevice(frontDoor);
        hub.registerDevice(smartLight);

        System.out.println("=== Smart home initialized ===");

        // Scenario 1. Returning home
        System.out.println("=== Scenario 1. Returning home ===");

        frontDoor.unlock();
        frontDoor.open();
        smartLight.turnOn();

        Thread.sleep(500);

        frontDoor.close();
        frontDoor.lock();
        smartLight.turnOff();


        System.out.println("=== Devices status ===");
        hub.showStatus();
    }
}
