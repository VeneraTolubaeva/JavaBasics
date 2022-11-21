package ru.ibs.day4.interfaces.multiple;

public class Main {
    public static void main(String[] args) {
        A a = new AB();
        B b = (B) a;
        b.print();
        b.getS();
    }
}
