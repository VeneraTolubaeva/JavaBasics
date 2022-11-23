package ru.ibs.day8.annotations;

@First
public class A {
    @First
    private int a;

    @First("field b")
    private int b;

    @First(value = "Field c")
    private int c;

    private int d;

    public int getD() {
        return d;
    }

}
