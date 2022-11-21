package ru.ibs.day6.iterators;

import ru.ibs.task.Person;

import java.util.Iterator;

public class WorkWIthIterator {
    public static void main3(String[] args) {
        Person person = new Person("Vasya", "Pupkin", 34);

        for (String s : person) {
            System.out.println(s);
        }

        for (String s : person) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Vasya", "Pupkin", 34);

        Iterator<String> iter = new PersonIterator(person);

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        iter = new PersonIterator(person);
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
