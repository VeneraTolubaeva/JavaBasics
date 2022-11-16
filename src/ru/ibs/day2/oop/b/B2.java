package ru.ibs.day2.oop.b;

import ru.ibs.day2.oop.a.A;

public class B2 extends A {
    public void checkAccess() {
        n1 = 1;
        n2 = 2;
        // n3 = 3; // Bad: n3 is package-private
        // n4 = 4; // Bad: n4 is private
    }
}

