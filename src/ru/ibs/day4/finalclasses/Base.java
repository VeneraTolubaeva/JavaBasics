package ru.ibs.day4.finalclasses;

public class Base {

    public static final double PI = 3.14; // PI это константа и она создается большими буквами

    private final House house = new House();

    public final void m1() {
        // Error: house is final
        // house = new House(2)
        System.out.println("Base m1()");
    }

    public void m2() {
        System.out.println("Base m2()");
    }

    public void m3() {
        System.out.println("Base m3()");
    }
}
