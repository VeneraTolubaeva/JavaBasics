package ru.ibs.day4.init;

public class Base {
    public static void m() {
        System.out.println("Base m()");
    }
    static {
        System.out.println(" - Static block 1");
    }

    {
        System.out.println(" - Block 1");
    }

    public Base() {
        System.out.println("Base constructor");
    }

    {
        System.out.println(" - Block 2");
    }
}
