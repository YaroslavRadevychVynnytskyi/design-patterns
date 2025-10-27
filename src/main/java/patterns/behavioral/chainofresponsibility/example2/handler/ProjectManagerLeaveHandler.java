package patterns.behavioral.chainofresponsibility.example2.handler;

import patterns.behavioral.chainofresponsibility.example2.request.LeaveRequest;

public class ProjectManagerLeaveHandler extends AbstractLeaveHandler {
    private static final int MAX_DAYS_CAN_APPROVE = 7;

    public ProjectManagerLeaveHandler() {
        super("PROJECT_MANAGER");
    }

    @Override
    protected void handle(LeaveRequest request) {
        if (MAX_DAYS_CAN_APPROVE >= request.days()) {
            approve(request);
        } else {
            next(request);
        }
    }
}
