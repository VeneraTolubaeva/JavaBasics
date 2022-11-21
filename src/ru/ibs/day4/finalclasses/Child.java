package ru.ibs.day4.finalclasses;

public class Child extends Base {
    private final String var;

    {
        var = "some value";
    }

    /*public Child() {
        var = "Some value";
    }*/

    public void m() {
        final String message = "Hello, World!";
        System.out.println(message);
    }

    public void n(final String message) {
        System.out.println(message);
    }
}
