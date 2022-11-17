package ru.ibs.day3.inheritance.v2;

public class GrandChild extends ChildClass{
    private BaseClass baseClass = new BaseClass();
    @Override
    public void m1() {
        baseClass.m1();
        System.out.println("GrandChild m1()");
    }
}
