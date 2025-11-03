package patterns.behavioral.command.example2.command;

import patterns.behavioral.command.example2.BankAccount;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DepositCommand implements Command {
    private BankAccount bankAccount;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    public DepositCommand(BankAccount bankAccount, BigDecimal amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public void execute() {
        bankAccount.deposit(amount);
    }

    @Override
    public void undo() throws Exception {
        bankAccount.withdraw(amount);
    }

    @Override
    public String getDescription() {
        return String.format("Deposit operation. Amount: [%s]. Timestamp: [%s]", amount, timestamp);
    }
}
