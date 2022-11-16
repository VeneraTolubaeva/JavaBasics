package ru.ibs.day3.visibility;

public class ChildClass extends BaseClass {
    public void m2() { // расширять метод можно, из protected в public
        System.out.println("Child m2()");
    }
//    protected void m1() {
//       Сужать область видимости для метода нельзя, делать метод и public в protected
//    }
    public void m3() {
        System.out.println("Child m3()");
    }
}
