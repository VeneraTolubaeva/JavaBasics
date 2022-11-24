package ru.ibs.day9.files;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderExample {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("files/writer.txt");
                BufferedReader br = new BufferedReader(fr);
        ) {
            // Old way
            /*String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }*/

            // New way
            br.lines().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
