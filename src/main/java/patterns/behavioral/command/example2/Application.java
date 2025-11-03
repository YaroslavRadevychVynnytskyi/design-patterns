package patterns.behavioral.command.example2;

import patterns.behavioral.command.example2.command.Command;
import patterns.behavioral.command.example2.command.DepositCommand;
import patterns.behavioral.command.example2.command.TransferCommand;
import patterns.behavioral.command.example2.command.WithdrawCommand;

import java.math.BigDecimal;
import java.util.UUID;

public class Application {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount1 = new BankAccount(UUID.randomUUID().toString(), BigDecimal.valueOf(0), "Jesse Pinkman");
        BankAccount bankAccount2 = new BankAccount(UUID.randomUUID().toString(), BigDecimal.valueOf(0), "Walter White");

        Command command1 = new DepositCommand(bankAccount1, BigDecimal.valueOf(300));
        Command command2 = new WithdrawCommand(bankAccount1, BigDecimal.valueOf(100));

        TransactionManager transactionManager = new TransactionManager();
        transactionManager.execute(command1);
        transactionManager.execute(command2);

        Command transferCommand1 = new TransferCommand(bankAccount1, bankAccount2, BigDecimal.valueOf(50));
        transactionManager.execute(transferCommand1);

        transactionManager.printHistory();

        System.out.println("===Undo operation===");

        transactionManager.undo();
        transactionManager.printHistory();
    }
}
