package patterns.behavioral.command.example2.command;

import patterns.behavioral.command.example2.BankAccount;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class WithdrawCommand implements Command {
    private BankAccount bankAccount;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    public WithdrawCommand(BankAccount bankAccount, BigDecimal amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public void execute() {
        try {
            bankAccount.withdraw(amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void undo() {
        bankAccount.deposit(amount);
    }

    @Override
    public String getDescription() {
        return String.format("Withdraw operation. Amount: [%s]. Timestamp: [%s]", amount, timestamp);
    }
}
