package ru.ibs.day10.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class B2 implements Serializable {
    private A a;

    private String data;

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        data = (String) ois.readObject();
        a = new A(ois.readUTF());
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.writeObject(data);
        oos.writeUTF(a.getData());
    }

    public B2(String data, A a) {
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
