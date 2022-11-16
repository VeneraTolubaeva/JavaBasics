package ru.ibs.day2.oop.a;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.n1 = 1; // Good: n1 is public
        a.n2 = 2; // Good: n2 is protected and is accessed from the same package
        a.n3 = 3; // Good: n3 is package-private and is accessed from the same package
        // a.n4 = 4; Bad: n4 is private
    }
}
