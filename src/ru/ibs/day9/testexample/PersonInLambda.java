package ru.ibs.day9.testexample;

import ru.ibs.task.Person;

import java.util.function.Consumer;

public class PersonInLambda {
    public static void main(String[] args) {
        withPerson(person -> {
            person.setAge(54);
            System.out.println(person);
        });
    }

    public static void withPerson(Consumer<Person> action) {
        action.accept(new Person("Ivan", "Petrov", 34));
    }
}
