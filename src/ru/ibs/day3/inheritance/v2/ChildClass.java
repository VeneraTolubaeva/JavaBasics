package ru.ibs.day3.inheritance.v2;

public class ChildClass extends BaseClass {
    @Override
    public void m1() {
        super.m1(); // ���� ����������� ���������� � ������ ������ �� ������� ����,
        // �� ��������� ������� ���� ���������� �� ���������
        System.out.println("Child m2()");
    }
}
