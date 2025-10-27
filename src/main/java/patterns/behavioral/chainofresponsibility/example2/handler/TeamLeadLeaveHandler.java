package patterns.behavioral.chainofresponsibility.example2.handler;

import patterns.behavioral.chainofresponsibility.example2.request.LeaveRequest;

public class TeamLeadLeaveHandler extends AbstractLeaveHandler {
    private static final int MAX_DAYS_CAN_APPROVE = 3;

    public TeamLeadLeaveHandler() {
        super("TEAM_LEAD");
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
