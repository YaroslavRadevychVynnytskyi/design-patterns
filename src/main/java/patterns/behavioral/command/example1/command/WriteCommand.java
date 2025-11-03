package patterns.behavioral.command.example1.command;

import patterns.behavioral.command.example1.TextEditor;

public class WriteCommand implements Command {
    private TextEditor editor;
    private String textToWrite;

    public WriteCommand(TextEditor editor, String textToWrite) {
        this.editor = editor;
        this.textToWrite = textToWrite;
    }

    @Override
    public void execute() {
        editor.write(textToWrite);
    }

    @Override
    public void undo() {
        editor.delete(textToWrite.length());
    }
}
