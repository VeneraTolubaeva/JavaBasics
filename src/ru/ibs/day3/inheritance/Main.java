package ru.ibs.day3.inheritance;

import ru.ibs.day3.inheritance.visibility.BaseClass;
import ru.ibs.day3.inheritance.visibility.ChildClass;

public class Main {
    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        bc.m1();
        //bc.m2(); is protected

        ChildClass cc = new ChildClass();
        cc.m1();
        cc.m2();

        System.out.println("*************");
        BaseClass child = new ChildClass();
        child.m3(); // ������ �������� ������ �� ����� ������ �������� ������ ��������� ������
        // ��� ��� � ���� �����������.
        child = new BaseClass(); // � ��� ����� ������ ����� �� �������� ������
        child.m3();

        // �� ����������� ������ �� BaseClass � ParalleChild, �� ��� ���� �� ��������,
        // ��� ��� ParallelChild �� �������� �������� ������� BaseClass
        //BaseClass parallel = new ParallelChild();
    }
}
