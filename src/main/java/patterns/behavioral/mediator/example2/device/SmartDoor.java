package patterns.behavioral.mediator.example2.device;

import patterns.behavioral.mediator.example2.mediator.SmartHomeMediator;

public class SmartDoor extends SmartDevice {
    private boolean isOpen;
    private boolean isLocked;

    public SmartDoor(SmartHomeMediator mediator, String id, String location) {
        super(mediator, id, location);
        this.isOpen = false;
        this.isLocked = true;
    }

    public void open() {
        if (!enabled) return;
        if (isLocked) {
            System.out.println("❌ " + id + ": Can't open - the door is locked");
            return;
        }

        isOpen = true;
        System.out.println("🚪 " + id + " (" + location + "): Door is opened");
        sendEvent("door_opened", null);
    }

    public void close() {
        if (!enabled) return;
        if (!isOpen) {
            System.out.println("❌ " + id + ": Can't close - the door is already closed");
            return;
        }

        isOpen = false;
        System.out.println("🚪 " + id + " (" + location + "): Door is closed");
        sendEvent("door_closed", null);
    }

    public void lock() {
        if (!enabled) return;
        if (isLocked) {
            System.out.println("❌ " + id + ": Can't lock - the door is already locked");
            return;
        }
        if (isOpen) {
            System.out.println("❌ " + id + ": Can't lock - the door is opened");
            return;
        }

        isLocked = true;
        System.out.println("🚪 " + id + " (" + location + "): Door is locked");
        sendEvent("door_locked", null);
    }

    public void unlock() {
        if (!enabled) return;
        if (!isLocked) {
            System.out.println("❌ " + id + ": Can't unlock - the door is already unlocked");
            return;
        }

        isLocked = false;
        System.out.println("🚪 " + id + " (" + location + "): Door is unlocked");
        sendEvent("door_unlocked", null);
    }


    @Override
    public String getStatus() {
        return String.format("%s (%s): %s, %s",
                id, location,
                isOpen ? "opened" : "closed",
                isLocked ? "locked" : "unlocked");
    }
}
