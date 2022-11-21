package ru.ibs.day4.interfaces.defaults;

public interface Base {
    default void print() {
        System.out.println("Hello, World!");
    }
}
