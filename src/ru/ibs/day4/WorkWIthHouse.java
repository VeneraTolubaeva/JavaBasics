package ru.ibs.day4;

import ru.ibs.task.House;
import ru.ibs.task.Person;

public class WorkWIthHouse {
    public static void main(String[] args) {
        Person builder = new Person("Vasya", "Pupkin", 34);
        House house = new House(builder);
        System.out.println(house);
        builder.setFirstName("Petya");
        System.out.println(house);
        System.out.println(builder);

        builder = house.getBuilder();
        builder.setLastName("Ivanov");
        System.out.println(house);
        System.out.println(builder);

        String firstName = builder.getFirstName();
        firstName = "Masha";
        System.out.println(builder);
    }
}
