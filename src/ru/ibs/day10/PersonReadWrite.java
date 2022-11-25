package ru.ibs.day10;

import ru.ibs.task.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonReadWrite {
    public static void main(String[] args) {
        String fileName = "files/person.data";
        /*try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            Person person = new Person("Vasya", "Pupkin", 34);
            oos.writeObject(person);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Object o = ois.readObject();
            if (o instanceof Person) {
                Person person = (Person) o;
                System.out.println(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
