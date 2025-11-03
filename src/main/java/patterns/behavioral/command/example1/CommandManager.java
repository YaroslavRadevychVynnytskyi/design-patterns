package patterns.behavioral.command.example1;

import patterns.behavioral.command.example1.command.Command;

import java.util.Stack;

public class CommandManager {
    private final Stack<Command> history = new Stack<>();
    private final Stack<Command> redoStack = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
        redoStack.clear();
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
            redoStack.push(command);
        }
    }
}
