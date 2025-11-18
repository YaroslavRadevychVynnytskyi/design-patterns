package patterns.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return children.stream()
                .mapToInt(FileSystemComponent::getSize)
                .sum();
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📁 " + name + "/");

        for (FileSystemComponent child : children) {
            child.display(indent + "  ");
        }
    }

    @Override
    public void add(FileSystemComponent fileSystemComponent) {
        children.add(fileSystemComponent);
    }

    @Override
    public void remove(FileSystemComponent fileSystemComponent) {
        children.remove(fileSystemComponent);
    }

    public List<FileSystemComponent> getChildren() {
        return new ArrayList<>(children);
    }
}
