package patterns.behavioral.command.example1.command;

import patterns.behavioral.command.example1.TextEditor;

public class DeleteCommand implements Command {
    private TextEditor editor;
    private String deletedText;
    private int lengthToDelete;

    public DeleteCommand(TextEditor editor, int lengthToDelete) {
        this.editor = editor;
        this.lengthToDelete = lengthToDelete;
    }


    @Override
    public void execute() {
        String currentText = editor.getText();
        int start = currentText.length() - lengthToDelete;
        if (start >= 0) {
            deletedText = currentText.substring(start);
            editor.delete(lengthToDelete);
        }
    }

    @Override
    public void undo() {
        if (deletedText != null) {
            editor.write(deletedText);
        }
    }
}
