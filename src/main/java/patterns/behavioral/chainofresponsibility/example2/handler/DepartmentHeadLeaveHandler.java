package patterns.behavioral.chainofresponsibility.example2.handler;

import patterns.behavioral.chainofresponsibility.example2.request.LeaveRequest;

public class DepartmentHeadLeaveHandler extends AbstractLeaveHandler {
    private static final int MAX_DAYS_CAN_APPROVE = 10;

    public DepartmentHeadLeaveHandler() {
        super("DEPARTMENT_HEAD");
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
