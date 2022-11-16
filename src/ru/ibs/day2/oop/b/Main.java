package ru.ibs.day2.oop.b;

import ru.ibs.day2.oop.a.A;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.n1 = 1; // Good: n1 is public
        //a.n2 = 2; // Bad: n2 is protected
        //a.n3 = 3; // Bad: n3 is package-private
        //a.n4 = 4; Bad: n4 is private

        B2 b = new B2();
        b.n1 = 1; // Good: n1 is public
        //b.n2 = 2; // Bad: n2 is protected
        // b.n3 = 3; // Bad: n3 is package-private
        //b.n4 = 4; // Bad: n4 is private
    }
}
