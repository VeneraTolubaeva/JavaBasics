package ru.ibs.day4.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure() {
            @Override
            public int perimeter() {
                return 0;
            }
        };
        Circle1 circle1 = new Circle1() {
            @Override
            public int perimeter() {
                return 0;
            }
        };

        Circle2 circle2 = new Circle2();
    }
}
