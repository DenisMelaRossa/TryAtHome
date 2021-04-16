package EPAMFileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem {
    List<FileSystemItem> children;

    public Folder() {
    }

    public Folder(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    public void getChildrenList() {
        for (FileSystemItem el : this.children) {
            System.out.println(el.name + "/");

        }
    }

    @Override
    public void getFileSystemStructure() {

        for (FileSystemItem element : this.children) {
            System.out.print(("\t"));
            System.out.println(element.name + "/");
            System.out.print("\t");
            element.getFileSystemStructure();
        }
    }

    public void addItem(FileSystemItem item) {
        this.children.add(item);
    }


    @Override
    public String toString() {
        return "Folder{" +
                "children=" + children +
                ", name='" + name + '\'' +
                '}';
    }
}
