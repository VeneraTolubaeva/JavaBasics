package ru.ibs.day7.generics;

import java.util.List;

public class Box<T> {
    private T item;
    private List<T> items;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    // Impossible to create instance of generic type
    /*public T newItem() {
        return new T();
    }*/
}