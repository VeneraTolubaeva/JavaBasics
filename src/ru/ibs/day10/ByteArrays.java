package ru.ibs.day10;

import ru.ibs.day4.interfaces.multiple.B;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ByteArrays {
    public static void main(String[] args) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeInt(12);
            oos.writeBoolean(true);
            oos.writeUTF("Some string");
            oos.writeChar('A');
            //oos.writeObject("String as Object");
            oos.writeObject(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        byte[] data = bos.toByteArray();

        System.out.println(Arrays.toString(data));

        ByteArrayInputStream bis = new ByteArrayInputStream(data);

        try (ObjectInputStream ois = new ObjectInputStream(bis)) {
            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readUTF());
            System.out.println(ois.readChar());
            String str = (String) ois.readObject();
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
