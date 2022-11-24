package ru.ibs.day9.files;

import java.io.File;
import java.util.Arrays;

public class WorkWithFiles {
    public static void main(String[] args) throws Exception {
        File f = new File("files/test.txt");
        //f.deleteOnExit();
        File d = new File("files");
        System.out.println("Dir exist? " + d.exists());
        System.out.println("Dir is file? " + d.isFile());
        System.out.println("Dir is dir? " + d.isDirectory());

        System.out.println("File exist? " + f.exists());
        System.out.println("Is file? " + f.isFile());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("File created? " + f.createNewFile());
        System.out.println("File exist? " + f.exists());
        System.out.println("Is file? " + f.isFile());

        //System.out.println("File deleted? " + f.delete());

        System.out.println("Parent: " + f.getParentFile().getAbsolutePath());

        File day8 = new File("src/ru/ibs/day8");
        Arrays.stream(day8.listFiles()).forEach(System.out::println);

        d = new File("files/a/b/c/");
        d.mkdirs();

        System.out.println("URI: " + f.toURI());
    }
}
