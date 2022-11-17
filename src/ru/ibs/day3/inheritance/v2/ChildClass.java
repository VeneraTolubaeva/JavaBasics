package ru.ibs.day3.inheritance.v2;

public class ChildClass extends BaseClass {
    @Override
    public void m1() {
        super.m1(); // дает возможность обратиться к методу класса на уровень выше,
        // на несколько уровней выше обратиться не получится
        System.out.println("Child m2()");
    }
}
