package EPAMFileSystem;

public abstract class FileSystemItem {
    public String name;

    public FileSystemItem() {
    }

    public FileSystemItem(String name) {
        this.name = name;
    }

    public abstract void getFileSystemStructure();
}
