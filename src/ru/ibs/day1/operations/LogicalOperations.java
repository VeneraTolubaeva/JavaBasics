package ru.ibs.day1.operations;

public class LogicalOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("a and b =" + (a && b));
        System.out.println("a and c =" + (a && c));
        System.out.println("b or c =" + (b || c));
    }

    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static boolean or(boolean a, boolean b) {
        return a || b;
    }


}
