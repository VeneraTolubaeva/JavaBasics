package ru.ibs.day10.serialization;

import java.io.Serializable;

public class B1 implements Serializable {
    private transient A a;

    private String data;

    public B1(String data, A a) {
        this.data = data;
        this.a = a;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", data='" + data + '\'' +
                '}';
    }
}
