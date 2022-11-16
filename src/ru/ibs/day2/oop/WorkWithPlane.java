package ru.ibs.day2.oop;

public class WorkWithPlane {
    public static void main(String[] args) {
        Plane boeing = new Plane();
        boeing.numOfWings = 2;
        boeing.engineType = "Whitney JT8";
        boeing.fuelAmount = 50_000;

        Plane airbus = new Plane();
        airbus.numOfWings = 2;
        airbus.engineType = "CFM56-5A1";
        airbus.fuelAmount = 40_000;

        boeing.takeoff();
        boeing.fly(1000);
        boeing.land();
        travelBy(airbus);

        System.out.println(airbus);
    }

    public static void travelBy(Plane plane) {
        plane.takeoff();
        plane.fly(1500);
        plane.land();
    }
}
