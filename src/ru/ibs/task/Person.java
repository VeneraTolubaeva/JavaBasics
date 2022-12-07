package ru.ibs.task;

import ru.ibs.day6.iterators.PersonIterator;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;

public class Person implements
        Cloneable,
        Comparable<Person>,
        Iterable<String>,
        Serializable {
    private static final String NAME = "asdf";
    private static final long serialVersionUID = 234;
    private String firstName;
    private String lastName;
    private int age;

    private String middleName;

    @Override
    public Iterator<String> iterator() {
        return new PersonIterator(this);
    }

    public Person() {

    }

    public Person(Person person) {
        firstName = person.firstName;
        lastName = person.lastName;
        age = person.age;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*
        1. Если объекты равны по equals, то их hashCode-ы тоже равны
        2. Если hashCode-ы объектов равны, то объекты могуть быть равны,
        а могут быть не равны
        */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // s1 < s2 -> x < 0
    // s1 == s2 -> 0
    // s1 > s2 -> x > 0
    @Override
    public int compareTo(Person otherPerson) {
        // lastName, firstName, age
        int res = lastName.compareTo(otherPerson.lastName);
        if (res == 0) {
            res = firstName.compareTo(otherPerson.firstName);
            if (res == 0) {
                return age - otherPerson.age;
            }
        }
        return res;
    }
}
