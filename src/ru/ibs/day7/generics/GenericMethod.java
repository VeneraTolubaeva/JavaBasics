package ru.ibs.day7.generics;

public class GenericMethod {
    public <T> void print(T item) {
        System.out.println(item);
    }

    public <T> T quote(T item) {
        return item;
    }
}
