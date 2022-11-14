package ru.ibs.day1.operations;

public class ComparisonOperations {
    public static void main (String[] args) {
        int a = 10;
        int b = 3;
        int c = 3;

        System.out.println("a == b ? " + equals(a, b)); // false
        System.out.println("a == a ? " + equals(a, a)); // true
        System.out.println("b == c ? " + equals(b, c));// true
        System.out.println("************************");
        System.out.println("a != b ? " + notEquals(a, b)); // true
        System.out.println("a != a ? " + notEquals(a, a)); // false
        System.out.println("b != c ? " + notEquals(b, c)); // false
        System.out.println("************************");
        System.out.println("a > b ? " + greater(a, b)); // true
        System.out.println("b > a ? " + greater(b, a)); // false
        System.out.println("b > c ? " + greater(b, c)); // false
        System.out.println("b >= c ? " + greaterOrEquals(b, c)); // true
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
