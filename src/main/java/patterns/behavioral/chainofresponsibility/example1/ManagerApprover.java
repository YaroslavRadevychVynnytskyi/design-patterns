package patterns.behavioral.chainofresponsibility.example1;

import java.math.BigDecimal;

public class ManagerApprover extends AbstractApprover {
    private static final BigDecimal MAX_CAN_HANDLE = BigDecimal.valueOf(1000);

    public ManagerApprover() {
        super("MANAGER");
    }

    @Override
    protected void handle(WithdrawalRequest request) {
        if (request.getAmount().compareTo(MAX_CAN_HANDLE) < 0) {
            approve(request);
        } else {
            pass(request);
        }
    }
}
