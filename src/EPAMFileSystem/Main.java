package EPAMFileSystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String enter = "root/folder1.1/folder2.1/file.text";
        String[] array = enter.split("/");
        System.out.println(Arrays.toString(array));

        Builder builder = new Builder(array[0]);
        builder.addFolder(array[1]);
        builder.addFolder(array[2]);
        builder.addFile(array[3]);

        builder.Root.getFileSystemStructure();
        Folder check = builder.CurrentFolder;
        System.out.println(check.name);


        System.out.println("++++++++++");
        builder.setCurrentFolder("root");
        Folder check2=builder.CurrentFolder;
        System.out.println(check2.name);
        System.out.println("++++++++++");

        Builder builder2=new Builder("root");
        builder2.addFolder("f1");
        builder2.setCurrentFolder("f1");
        Folder check3=builder2.CurrentFolder;
        System.out.println(check3.name);

    }
}