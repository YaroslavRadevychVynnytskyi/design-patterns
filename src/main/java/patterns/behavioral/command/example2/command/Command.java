package patterns.behavioral.command.example2.command;

public interface Command {
    void execute();
    void undo() throws Exception;
    String getDescription();
}
