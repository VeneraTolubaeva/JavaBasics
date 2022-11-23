package ru.ibs.day7;

public class WorkWithVarargs {
    public static void main(String[] args) {
        m1();
        m1("Hello");
        m1("one", "two", "three");
    }

    // 1. Non-vararg arguments are possible
    // 2. Varargs MUST be the last argument in list of parameters
    public static void m2(int n, String... strings) {

    }

    public static void m1(String... strings) {
        System.out.println("Length: " + strings.length);
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("========");
    }
}
