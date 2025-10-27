package patterns.behavioral.chainofresponsibility.example1;

public abstract class AbstractApprover implements Approver {
    private Approver nextApprover;
    private final String role;

    public AbstractApprover(String role) {
        this.role = role;
    }

    protected abstract void handle(WithdrawalRequest request);

    @Override
    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(WithdrawalRequest request) {
        handle(request);
    }

    protected void approve(WithdrawalRequest request) {
        System.out.printf("[%s] ✅ СХВАЛИВ запит на суму %.2f грн. Призначення: %s\n", role, request.getAmount(), request.getPurpose());
    }

    protected void pass(WithdrawalRequest request) {
        if (nextApprover != null) {
            System.out.printf("[%s] ➡️ Не може обробити (%.2f грн), передає його наступному.\n", role, request.getAmount());
            nextApprover.processRequest(request);
        } else {
            System.out.printf("[%s] ❌ Не може обробити (%.2f грн). Ланцюжок завершено без погодження.\n", role, request.getAmount());
        }
    }
}
