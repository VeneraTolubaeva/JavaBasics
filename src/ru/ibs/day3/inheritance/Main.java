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
        child.m3(); // методы базового класса во время работы вызывают методы дочернего класса
        // вот это и есть полиморфизм.
        child = new BaseClass(); // а тут будет вызван метод из базового класса
        child.m3();

        // Мы скопировали данные из BaseClass в ParalleChild, но код ниже не работает,
        // так как ParallelChild не является дочерним классом BaseClass
        //BaseClass parallel = new ParallelChild();
    }
}
