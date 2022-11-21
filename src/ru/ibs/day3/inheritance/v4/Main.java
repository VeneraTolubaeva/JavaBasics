package ru.ibs.day3.inheritance.v4;

public class Main {
    public static void main(String[] args) {
       Base b1 = new Base();
       Base b2 = new Child();

       b1.m1();
       b2.m1();

       Base.m2(); // Статические методы принадлежат к классу и не могут быть перегружены поэтому b1.m2() не работает
       Base.m2(); // Статитческие методы принадлежат классу, а не экземпляру класса поэтому b2.m2() не работает
    }

    public static void main1(String[] args) {
        Base b1 = new Base();
        Base.n = 12;
        b1.m1();
        Base.m2();
        System.out.println(Base.n);

        Base b2 = new Base();
        Base.n = 45;
        System.out.println(Base.n);
    }
}
