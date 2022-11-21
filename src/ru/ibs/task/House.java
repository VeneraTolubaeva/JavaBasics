package ru.ibs.task;

public class House {
    private Person builder;

    public House(Person builder) {
        this.builder = builder;
    }
    public Person getBuilder() {
        return builder;
    }
}
