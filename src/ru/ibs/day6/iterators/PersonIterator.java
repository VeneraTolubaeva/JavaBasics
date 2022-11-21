package ru.ibs.day6.iterators;

import ru.ibs.task.Person;

import java.util.Iterator;

public class PersonIterator implements Iterator<String> {

    private final Person person;

    private int count = 0;

    public PersonIterator(Person person) {
        this.person = new Person(person);
    }

    @Override
    public boolean hasNext() {
        return count < 3;
    }

    @Override
    public String next() {
        // firstName, lastName, age
        count += 1;
        switch (count) {
            case 1: return person.getFirstName();
            case 2: return person.getLastName();
            case 3:
                return Integer.toString(person.getAge());
            default:
                throw new RuntimeException("No more elements");
        }
    }
}
