package patterns.behavioral.command.example2;

import java.math.BigDecimal;

public class BankAccount {
    private String accountNumber;
    private BigDecimal balance;
    private String owner;

    public BankAccount(String accountNumber, BigDecimal balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws Exception {
        if (amount.compareTo(balance) > 0) {
            throw new Exception("Insufficient balance");
        }
        balance = balance.subtract(amount);
    }
}
