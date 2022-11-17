package ru.ibs.day3.polimorphism;

public class Rectangle extends Figure {
    private int width;
    private int height;
    @Override
    public int perimeter() {
        return 2 * (width + height);
    } // ��� ���������� �������, �� ��� ����������� ����� perimeter
    // �� �������� ������ Figure
    // ����������� - ��� ��������� ������ �� �������� ������ � ����������� ������
    // � ������������ ���� ��������� ���������: ��������������� ������
    public int perimeter (int width, int height) {
        return 0;
    } // ��. WorkWithFigures
    // � ����� ������ �� ����� �������������� ����� ����� �������� ���������� �������
    // � ����� � ��� �� ������ � ����� � ��� �� ������� ����������

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
