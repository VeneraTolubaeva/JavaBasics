package ru.ibs.day3.polimorphism;

public class WorkWithFigures {
    public static void main(String[] args) {
        //Rectangle rect = new Rectangle();
        //rect.per - тут мы можем вызвать оба метода perimeter из класса Rectangle
        // вот это называется переопределение методов
        // В одном классе мы можем переопределить метод путем создания нескольких методов
        // с одним и тем же именем и одним и тем же списком параметров
        //Circle circle = new Circle();
        printPerimeter(new Rectangle());
        printPerimeter(new Square());
    }

    public static void printPerimeter(Rectangle rect) {
        rect.setHeight(20);
        rect.setWidth(40);
        System.out.println(rect.perimeter());
    }
}
