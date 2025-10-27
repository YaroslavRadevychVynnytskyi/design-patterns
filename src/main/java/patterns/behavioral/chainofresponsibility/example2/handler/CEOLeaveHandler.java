package patterns.behavioral.chainofresponsibility.example2.handler;

import patterns.behavioral.chainofresponsibility.example2.request.LeaveRequest;

public class CEOLeaveHandler extends AbstractLeaveHandler {
    private static final int MAX_DAYS_CAN_APPROVE = 30;

    public CEOLeaveHandler() {
        super("CEO");
    }

    @Override
    protected void handle(LeaveRequest request) {
        if (MAX_DAYS_CAN_APPROVE >= request.days()) {
            approve(request);
        } else {
            System.out.println("CEO не може погодити відпустку більш ніж на 30 днів");
        }
    }
}
