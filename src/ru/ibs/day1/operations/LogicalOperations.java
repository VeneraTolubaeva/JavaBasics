package ru.ibs.day1.operations;

public class LogicalOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("a and b = " + and(a, b));
        System.out.println("a and c = " + and(a, c));
        System.out.println("a or b = " + or(a, b));

        System.out.println("!a == " + !a); // false
        System.out.println("!b == " + !b); // true
    }

    public static boolean and(boolean a, boolean b) {
        return a && b;
    }
    public static boolean or(boolean a, boolean b) {
        return a || b;
    }
}
