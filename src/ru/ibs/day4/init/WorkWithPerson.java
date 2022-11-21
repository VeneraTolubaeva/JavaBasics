package ru.ibs.day4.init;

import ru.ibs.task.Person;

public class WorkWithPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Vasya", "Pupkin", 34);
        Person p2 = new Person("Vasya", "Pupkin", 34);
        Person p3 = p1;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2); // p1 != p2 ��� ��� ��� 2 ������ ������� ������
        System.out.println(p1.equals(p2)); // p1 != p2 ��� ��� ��� 2 ������ ������� ������
        System.out.println(p1 == p3); // p1 = p3, ��� ��� ��������� �� ���� � ��� �� ������ � ������� ������
    }
}
