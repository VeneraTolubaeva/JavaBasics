package ru.ibs.day10.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        String fileName = "files/b2.data";

        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            B2 b = new B2("Hello", new A("World!"));
            System.out.println(b);
            oos.writeObject(b);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            B2 b = (B2) ois.readObject();
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        String fileName = "files/b.data";

        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            B1 b = new B1("Hello", new A("World!"));
            System.out.println(b);
            oos.writeObject(b);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            B1 b = (B1) ois.readObject();
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
