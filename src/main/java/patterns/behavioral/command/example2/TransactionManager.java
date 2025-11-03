package patterns.behavioral.command.example2;

import patterns.behavioral.command.example2.command.Command;

import java.util.Stack;

public class TransactionManager {
    private Stack<Command> history = new Stack<>();

    public void execute(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() throws Exception {
        Command latest = history.pop();
        latest.undo();
    }

    public void printHistory() {
        history.forEach(command -> System.out.println(command.getDescription()));
    }
}
