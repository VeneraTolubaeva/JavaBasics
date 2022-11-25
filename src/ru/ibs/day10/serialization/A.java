package ru.ibs.day10.serialization;

public class A {
    private String data;

    public A(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "A{" +
                "data='" + data + '\'' +
                '}';
    }
}
