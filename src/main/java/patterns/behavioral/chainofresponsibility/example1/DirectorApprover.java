package patterns.behavioral.chainofresponsibility.example1;

import java.math.BigDecimal;

public class DirectorApprover extends AbstractApprover {

    private static final BigDecimal MAX_CAN_HANDLE = BigDecimal.valueOf(5000);

    public DirectorApprover() {
        super("DIRECTOR");
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
