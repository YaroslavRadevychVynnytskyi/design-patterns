package patterns.behavioral.command.example1;

import patterns.behavioral.command.example1.command.Command;
import patterns.behavioral.command.example1.command.DeleteCommand;
import patterns.behavioral.command.example1.command.WriteCommand;

public class Application {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Command writeCommand1 = new WriteCommand(editor, "Hello, ");
        Command writeCommand2 = new WriteCommand(editor, "world");
        Command deleteCommand1 = new DeleteCommand(editor, 3);

        CommandManager commandManager = new CommandManager();
        commandManager.executeCommand(writeCommand1);
        System.out.println(editor.getText());

        commandManager.executeCommand(writeCommand2);
        System.out.println(editor.getText());

        commandManager.executeCommand(deleteCommand1);
        System.out.println(editor.getText());

        commandManager.undo();
        System.out.println(editor.getText());
    }
}
