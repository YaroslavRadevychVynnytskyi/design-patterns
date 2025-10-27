package patterns.behavioral.chainofresponsibility.example2.handler;

import patterns.behavioral.chainofresponsibility.example2.request.LeaveRequest;

public abstract class AbstractLeaveHandler {
    private AbstractLeaveHandler next;
    private final String managerLevel;

    protected AbstractLeaveHandler(String managerLevel) {
        this.managerLevel = managerLevel;
    }

    public AbstractLeaveHandler link(AbstractLeaveHandler first, AbstractLeaveHandler... chain) {
        AbstractLeaveHandler head = first;
        for (AbstractLeaveHandler nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public void processRequest(LeaveRequest request) {
        handle(request);
    }

    protected abstract void handle(LeaveRequest request);

    protected void approve(LeaveRequest request) {
        System.out.printf("[%s] ✅ СХВАЛИВ запит відпустку %s дні. Працівник: %s\n", managerLevel, request.days(), request.employee());
    }

    protected void next(LeaveRequest request) {
        if (next != null) {
            System.out.printf("[%s] ➡️ Не може схвалити запит на відпусту %s, передає його наступному.\n", managerLevel, request.days());
            next.handle(request);
        } else {
            System.out.printf("[%s] ❌ Не може схвалити цей запит. Ланцюжок завершено без погодження.%n", managerLevel);
        }
    }

}
