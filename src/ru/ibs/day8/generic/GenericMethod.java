package ru.ibs.day8.generic;

import java.util.ArrayList;

public class GenericMethod {
    public <T extends Comparable<T>> int compare(T item1, T item2) {
        return item1.compareTo(item2);
    }

    public <T> void print(T item) {

    }

    public <T extends Number> T max(T n1, T n2) {
        if (n1.doubleValue() > n2.doubleValue()) {
            return n1;
        }
        return n2;
    }

    public Object listOfA() {
        return new ArrayList<A>();
    }

    public Object helloString() {
        return "Hello, World!";
    }

    public Object listOfAV2() {
        return new ListOfA();
    }
}
