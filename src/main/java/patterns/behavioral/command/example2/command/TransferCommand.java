package patterns.behavioral.command.example2.command;

import patterns.behavioral.command.example2.BankAccount;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransferCommand implements Command {
    private BankAccount sender;
    private BankAccount receiver;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    public TransferCommand(BankAccount sender, BankAccount receiver, BigDecimal amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public void execute() {
        try {
            sender.withdraw(amount);
            receiver.deposit(amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void undo() throws Exception {
        receiver.withdraw(amount);
        sender.deposit(amount);
    }

    @Override
    public String getDescription() {
        return String.format("Transfer operation. Amount: [%s]. Timestamp: [%s]", amount, timestamp);
    }
}
