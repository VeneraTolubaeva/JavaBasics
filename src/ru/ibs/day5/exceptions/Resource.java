package ru.ibs.day5.exceptions;

import java.io.Closeable;
import java.util.Random;

//public class Resource implements Closeable {
public class Resource implements AutoCloseable {
    private final Random random = new Random();

    public void open() throws Exception {
        System.out.println("Resource opening");
        double r = random.nextDouble();
        if (r < 0.01) {
            throw new Exception();
        }
    }

    public void close() throws Exception {
        System.out.println("Resource closing");
        double r = random.nextDouble();
        if (r < 0.01) {
            throw new Exception();
        }
    }
}
