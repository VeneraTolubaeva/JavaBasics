package ru.ibs.day10.sockets;

import java.io.Serializable;
import java.util.Date;

public class Request implements Serializable {
    public Date date = new Date();
    public String payload;

    public Request(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Request{" +
                "date=" + date +
                ", payload='" + payload + '\'' +
                '}';
    }
}
