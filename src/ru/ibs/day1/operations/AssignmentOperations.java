package ru.ibs.day1.operations;

public class AssignmentOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        a += b; // a = a + b = 13
        System.out.println("a == " + a);

        a -= b; // a = a - b = 10
        System.out.println("a == " + a);

        a *= b; // a = a * b = 30
        System.out.println("a == " + a);

        a /= b; // a = a / b = 10
        System.out.println("a == " + a);
    }
}
