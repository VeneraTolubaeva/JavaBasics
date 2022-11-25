package ru.ibs.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutput {
    public static void main(String[] args) {
        /*try (
                FileOutputStream fos = new FileOutputStream("files/object.data");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeInt(12);
            oos.writeUTF("Hello, World!");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try (
                FileInputStream fos = new FileInputStream("files/object.data");
                ObjectInputStream oos = new ObjectInputStream(fos);
        ) {
            System.out.println(oos.readInt());
            System.out.println(oos.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
