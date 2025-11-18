package patterns.structural.composite.example1;

public class Application {
    public static void main(String[] args) {
        File file1 = new File("document.txt", 10);
        File file2 = new File("image.jpg", 200);
        File file3 = new File("video.mp4", 1500);
        File file4 = new File("readme.md", 5);

        Folder root = new Folder("Root");
        Folder documents = new Folder("Documents");
        Folder media = new Folder("Media");

        root.add(documents);
        root.add(media);
        root.add(file4);

        documents.add(file1);

        media.add(file2);
        media.add(file3);

        System.out.println("===== File System Structure =====");
        root.display("");
        System.out.println("Size of root: " + root.getSize() + " KB");
        System.out.println("Size of documents: " + documents.getSize() + " KB");
        System.out.println("Size of media: " + media.getSize() + " KB");
        System.out.println("Size of file1: " + file1.getSize() + " KB");

        /*
        Output:

        ===== File System Structure =====
            📁 Root/
              📁 Documents/
                📄 document.txt (10 KB)
              📁 Media/
                📄 image.jpg (200 KB)
                📄 video.mp4 (1500 KB)
              📄 readme.md (5 KB)
            Size of root: 1715 KB
            Size of documents: 10 KB
            Size of media: 1700 KB
            Size of file1: 10 KB
         */
    }
}
