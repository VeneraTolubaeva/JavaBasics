package ru.ibs.day4.init;

public class Child extends Base {
    public static String staticData ();

    static {
        System.out.println(" - Static block 2");
    }
    {
        System.out.println(" - Block 3");
        data = "";
    }
}
