package patterns.behavioral.chainofresponsibility.example1;

public class PresidentApprover extends AbstractApprover {
    public PresidentApprover() {
        super("PRESIDENT");
    }

    @Override
    protected void handle(WithdrawalRequest request) {
        approve(request);
    }
}
