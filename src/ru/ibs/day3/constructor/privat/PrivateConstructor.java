package ru.ibs.day3.constructor.privat;

public class PrivateConstructor {
    private PrivateConstructor() {

    }

    public static PrivateConstructor getInstance() {
        return new PrivateConstructor();
    }
}
