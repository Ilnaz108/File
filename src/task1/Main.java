package task1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File folder = new File("C://JavaLearn//NewFile");
        boolean created = folder.mkdir();
        if (created)
            System.out.print("Папка была создана");
        File newFolder = new File("C://JavaLearn//NewFile");
        folder.renameTo(newFolder);
        boolean deleted = newFolder.delete();
        if (deleted);
        System.out.println("Папка была удалена");

    }
}
