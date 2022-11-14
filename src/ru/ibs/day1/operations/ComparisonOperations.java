package ru.ibs.day1.operations;

public class ComparisonOperations {
    public static void main (String[] args) {
        int a = 10;
        int b = 3;
        int c = 3;

        System.out.println("a == b ? " + equals(a, b));
        System.out.println("a == a ? " + equals(a, a));
        System.out.println("b == c ? " + equals(b, c));
    }

    public static boolean equals(int a, int b) {
        return a == b;
    }

    public static boolean notEquals(int a, int b) {
        return a != b;

    }

    public static boolean greater(int a, int b) {
        return a > b;
    }

    public static boolean greaterOrEquals(int a, int b) {
        return a >= b;
    }

}
