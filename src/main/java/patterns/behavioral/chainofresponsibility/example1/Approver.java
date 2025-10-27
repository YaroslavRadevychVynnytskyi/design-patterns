package patterns.behavioral.chainofresponsibility.example1;

public interface Approver {
    void setNext(Approver approver);
    void processRequest(WithdrawalRequest request);
}
