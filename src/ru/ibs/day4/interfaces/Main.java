package ru.ibs.day4.interfaces;

import ru.ibs.task.Person;

public class Main {
    public static void main(String[] args) {
        Pickup p1 = new Pickup();
        Bus p2 = new Pickup();
        Truck p3 = new Pickup();

        Truck p4 = (Truck) p2;
        acceptObject(p1);
        acceptObject(p2);
        acceptObject(new Person("Vasya", "Petrov", 34));

        // Possible
        BusImpl bus = new BusImpl();
        // Preferrable
        Bus bus1 = new BusImpl();
    }

    public static void acceptObject(Object obj) {
        if (obj instanceof Vehicle) {
            if (obj instanceof Bus) {
                ((Bus)obj).board();
            }
        } else if (obj instanceof Person) {
            ((Person) obj).setAge(56);
            System.out.println(obj);
        }
    }
}
