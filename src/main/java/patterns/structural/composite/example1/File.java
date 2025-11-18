package patterns.structural.composite.example1;

public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📄 " + name + " (" + size + " KB)");
    }
}
