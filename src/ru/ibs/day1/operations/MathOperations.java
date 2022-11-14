package ru.ibs.day1.operations;

public class MathOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        System.out.println(a + "%" + b + "=" + (a % b));

        // a = 10
        System.out.println("a++ = " + (a++));
        System.out.println("a = " + a);

        // a = 11
        System.out.println("++a = " + (++a));
        System.out.println("a = " + a);

        // a = 12
        System.out.println("a-- = " + (a--));
        System.out.println("a = " + a);

        // a = 11
        System.out.println("--a = " + (--a));
        System.out.println("a = " + a);
    }
}
