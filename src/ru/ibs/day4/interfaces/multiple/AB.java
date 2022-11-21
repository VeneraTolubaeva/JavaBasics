package ru.ibs.day4.interfaces.multiple;

public class AB implements A, B{
    @Override
    public int getN() {
        return 2;
    }

    @Override
    public void print() {
        System.out.println("Hello, World!");
    }

    @Override
    public String getS() {
        return "Something";
    }
}
