package ru.ibs.day3.polimorphism;

public class Circle extends Figure {
    private int radius;

    @Override
    public int perimeter() {
        return (int)(2 * Math.PI * radius); // �������� ��� ����� � int ��� ��� ��� ����� 2 �������� ����� double
    }
    public double perimeter(String s) {
        return 0.0;
        // �������� ��� ������ ��������� ������ ���� �� ������� �����
        // ������ �������� (String s), ��� ��� � ��� ��� ���� int perimeter() � ���� ��� � �������
        // double perimeter(), �� ��������� ������ �� ������ ��� ������ ����� ������� int ��� double
        // ��� ��������������� �������
    }
}

