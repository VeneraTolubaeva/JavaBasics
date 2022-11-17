package ru.ibs.day3.polimorphism;

public class Square extends Rectangle {
    private int size;

    public int permeter() {
        return 4 * size;
    }
    public void setWidth(int width) {
        size = width;
    }

    public void setHeight(int height) {
        size = height;
    }
}
