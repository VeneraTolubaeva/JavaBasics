package ru.ibs.day2.oop;

public class Plane {
    int numOfWings;
    String engineType;
    int fuelAmount;

    void takeoff() {
        System.out.println("Take off");
    }

    void fly(int km) {
        System.out.println(("Fly for " + km + " km"));
    }

    void land() {
        System.out.println("Land");
    }
}
