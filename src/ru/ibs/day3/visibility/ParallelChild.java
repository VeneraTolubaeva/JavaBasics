package ru.ibs.day3.visibility;

public class ParallelChild {
    public void m1() {
        System.out.println("m1()");
    }
    protected void m2() {
        System.out.println("m2()");
    }
    public void m3() {
        System.out.println("Base m3()");
    }
}
