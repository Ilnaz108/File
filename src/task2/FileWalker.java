package task2;

import java.io.File;

public class FileWalker {
    public static void main(String... args) {
        File[] files = new File("C:/downloads").listFiles();
        if (files != null)
            getFile(files);
    }

    public static void getFile(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                getFile(file.listFiles());
            } else {
                System.out.println("File: " + file);
            }
        }
    }
}
