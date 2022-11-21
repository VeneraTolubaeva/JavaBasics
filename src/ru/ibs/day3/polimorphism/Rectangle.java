package ru.ibs.day3.polimorphism;

public class Rectangle extends Figure {
    private int width;
    private int height;
    @Override
    public int perimeter() {
        return 2 * (width + height);
    } // Это перегрузка методов, мы тут перегрузили метод perimeter
    // из базового класса Figure
    // Мы в произвольном классе изменили методы базового класса. Вот это есть Полиморфизм
    // У полиморфизма есть несколько вариантов: переопределение метода и перегрузка метода
    public int perimeter (int width, int height) {
        return 0;
    } // см. WorkWithFigures
    // В одном классе мы можем переопределить метод путем создания нескольких методов
    // с одним и тем же именем и одним и тем же списком параметров

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
