package EPAMFileSystem;

import java.util.Stack;

public class Builder {

    public Folder Root;
    public Folder CurrentFolder;

    public Builder(String folder) {
        this.Root = new Folder(folder);
        this.CurrentFolder = Root;
    }

    Folder setDefaultFolder(String initialFolder) {

            for (FileSystemItem element : Root.children) {
                if(element.name.equals(initialFolder)){
                    CurrentFolder=(Folder)element;
                    return (Folder)element;
                } else{
                    Root=(Folder)element;
                    setDefaultFolder(initialFolder);
                }
            }
            this.CurrentFolder=Root;
            return Root;
    }
    Folder setCurrentFolder(String currentFolderName){
        Stack<Folder> folderStack=new Stack<Folder>();
        folderStack.push(this.Root);
        while(!folderStack.empty()){
            Folder newCurrentFolder=folderStack.pop();
            String folderName= newCurrentFolder.name;
            if (folderName.equals(currentFolderName)){
                this.CurrentFolder=newCurrentFolder;
                return newCurrentFolder;
            }
            for(FileSystemItem item:newCurrentFolder.children){
                if (item.getClass()==Folder.class) {
                    folderStack.push((Folder) item);
                } else{
                    this.CurrentFolder=this.Root;
                    return this.Root;
                }
            }
        }
        this.CurrentFolder=Root;
        return this.CurrentFolder;
    }

    File addFile(String name) {
        File file = new File(name);
        CurrentFolder.addItem(file);
        return file;
    }

    Folder addFolder(String name) {
        Folder folder = new Folder(name);
        this.CurrentFolder.addItem(folder);
        this.CurrentFolder = folder;
        return folder;
    }


    @Override
    public String toString() {
        return "Builder{" +
                "Root=" + Root +
                ", CurrentFolder=" + CurrentFolder +
                '}';
    }
}
