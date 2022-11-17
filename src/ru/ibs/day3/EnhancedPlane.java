package ru.ibs.day3;

public class EnhancedPlane {
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

//    public String toString() {
//        return "A plane"; // ввела руками
//    }

    @Override // выведено через пр.кн.мыши -> Generate -> toString
    public String toString() {
        return "EnhancedPlane{" +
                "numOfWings=" + numOfWings +
                ", engineType='" + engineType + '\'' +
                ", fuelAmount=" + fuelAmount +
                '}';
    }
}
