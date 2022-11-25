package ru.ibs.day10.sockets;

import java.io.Serializable;
import java.util.Random;

public class Response implements Serializable {
    public int random;
    public String payload;

    public Response(String payload) {
        random = new Random().nextInt(100);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Response{" +
                "random=" + random +
                ", payload='" + payload + '\'' +
                '}';
    }
}
