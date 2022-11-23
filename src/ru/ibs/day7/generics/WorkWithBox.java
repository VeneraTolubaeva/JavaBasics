package ru.ibs.day7.generics;

import ru.ibs.task.Person;

public class WorkWithBox {
    public static void main(String[] args) {
        Box box1 = new Box(new Object());
        Box<Integer> box2 = new Box<>(2);
        Box<String> box3 = new Box<>("Some item");
        Box<Person> box4 = new Box<>(
                new Person("Vasya", "Pupkin", 34)
        );


    }
}
