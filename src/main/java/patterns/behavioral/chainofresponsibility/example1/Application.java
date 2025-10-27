package patterns.behavioral.chainofresponsibility.example1;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        Approver manager = new ManagerApprover();
        Approver director = new DirectorApprover();
        Approver president = new PresidentApprover();

        manager.setNext(director);
        director.setNext(president);

        WithdrawalRequest req1 = new WithdrawalRequest(BigDecimal.valueOf(950.0), "Personal expenses");
        WithdrawalRequest req2 = new WithdrawalRequest(BigDecimal.valueOf(4800.0), "Tuition fee");
        WithdrawalRequest req3 = new WithdrawalRequest(BigDecimal.valueOf(15000.00), "Purchase of Equipment");
        WithdrawalRequest req4 = new WithdrawalRequest(BigDecimal.valueOf(1000000.00), "Business");

        System.out.println("--- Запит 1: 950 грн ---");
        manager.processRequest(req1);

        System.out.println("\n--- Запит 2: 4800 грн ---");
        manager.processRequest(req2);

        System.out.println("\n--- Запит 3: 15000 грн ---");
        manager.processRequest(req3);

        System.out.println("\n--- Запит 4: 1000000 грн ---");
        manager.processRequest(req4);
    }
}
