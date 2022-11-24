package ru.ibs.day9.files;

import ru.ibs.day4.interfaces.multiple.B;
import ru.ibs.task.Person;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriterExample {
    public static void main(String[] args) {
        //try (PrintWriter pw = new PrintWriter("files/writer.txt")) {
        try (
                FileOutputStream fos = new FileOutputStream(
                        "files/writer.txt",
                        true
                );
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw=new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw);
        ) {
            pw.println("Hello, World!");
            pw.println(3);
            pw.println(new Person("Ivan", "Petrov", 45));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
