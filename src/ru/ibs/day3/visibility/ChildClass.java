package ru.ibs.day3.visibility;

public class ChildClass extends BaseClass {
    public void m2() { // ��������� ����� �����, �� protected � public
        System.out.println("Child m2()");
    }
//    protected void m1() {
//       ������ ������� ��������� ��� ������ ������, ������ ����� � public � protected
//    }
    public void m3() {
        System.out.println("Child m3()");
    }
}
