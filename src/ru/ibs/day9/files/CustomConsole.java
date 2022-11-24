package ru.ibs.day9.files;

import java.io.PrintStream;

public class CustomConsole {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("console.txt")) {
            System.setOut(ps);
            System.out.println("Hello, World!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
