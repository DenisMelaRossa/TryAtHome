package EPAMFileSystem;

public class File extends FileSystemItem{

    public File(String name){
        super(name);
    }

    @Override
    public void getFileSystemStructure(){
        System.out.println(this.name);
    }
}
