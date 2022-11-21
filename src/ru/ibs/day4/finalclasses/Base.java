package ru.ibs.day4.finalclasses;

public class Base {
    // Defining constant
    public static final double PI = 3.14;

    private final House house = new House();

    public final void m1() {
        // Error: house if final
        //house = new House(2);
        System.out.println("Base m1()");
    }

    public void m2() {
        System.out.println("Base m1()");
    }

    public void m3() {
        System.out.println("Base m1()");
    }
}
