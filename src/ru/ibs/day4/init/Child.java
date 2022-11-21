package ru.ibs.day4.init;

public class Child extends Base {
    private String data;
    public static String staticData;

    static {
        System.out.println(" - Static block 2");
        staticData = "";
    }

    {
        System.out.println(" - Block 3");
        data = "";
    }

    public Child() {
        System.out.println("Child constructor");
    }
}
