package ru.ibs.day3.polimorphism;

public class WorkWithFigures {
    public static void main(String[] args) {
        //Rectangle rect = new Rectangle();
        //rect.per - ��� �� ����� ������� ��� ������ perimeter �� ������ Rectangle
        // ��� ��� ���������� ��������������� �������
        // � ����� ������ �� ����� �������������� ����� ����� �������� ���������� �������
        // � ����� � ��� �� ������ � ����� � ��� �� ������� ����������
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
