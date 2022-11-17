package ru.ibs.day3.polimorphism;

public class Circle extends Figure {
    private int radius;

    @Override
    public int perimeter() {
        return (int)(2 * Math.PI * radius); // приводим все числа к int так как все кроме 2 является типом double
    }
    public double perimeter(String s) {
        return 0.0;
        // изменять тип метода получится только если мы добавим какой
        // нибудь параметр (String s), так как у нас уже есть int perimeter() и если еще и создать
        // double perimeter(), то программа просто не поймет что именно нужно вернуть int или double
        // это переопределение методов
    }
}

