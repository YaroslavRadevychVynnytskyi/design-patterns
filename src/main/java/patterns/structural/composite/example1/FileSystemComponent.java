package patterns.structural.composite.example1;

public interface FileSystemComponent {

    String getName();

    int getSize();

    void display(String indent);

    default void add(FileSystemComponent fileSystemComponent) {
        throw new UnsupportedOperationException("Can't add to the leaf");
    }

    default void remove(FileSystemComponent fileSystemComponent) {
        throw new UnsupportedOperationException("Can't add to the leaf");
    }
}
