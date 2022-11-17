package ru.ibs.day3;

import ru.ibs.day2.oop.Plane;

public class Main {
    public static void main(String[] args) {
        EnhancedPlane boeing = new EnhancedPlane();
        boeing.numOfWings = 2;
        boeing.engineType = "Whitney JT8";
        boeing.fuelAmount = 50_000;
        System.out.println(boeing);

    }
}
