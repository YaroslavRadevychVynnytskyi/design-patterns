package patterns.behavioral.command.example1;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String text) {
        this.text.append(text);
    }

    public void delete(int length) {
        int start = text.length() - length;
        if (start >= 0) {
            text.delete(start, text.length());
        }
    }

    public String getText() {
        return text.toString();
    }
}
