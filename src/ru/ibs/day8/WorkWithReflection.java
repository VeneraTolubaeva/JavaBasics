package ru.ibs.day8;

import ru.ibs.task.House;
import ru.ibs.task.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class WorkWithReflection {
    public static void main(String[] args) {
        House house = new House(
                new Person("Vasya", "Pupkin", 34)
        );
        //Class<?> clazz = house.getClass();
        Class<?> clazz = House.class;
        try {
            Field bulderField = clazz.getDeclaredField("builder");
            Class<?> builderFieldType = bulderField.getType();
            System.out.println(builderFieldType);

            bulderField.setAccessible(true);
            System.out.println(bulderField.get(house));

            Method getFirstNameMethod = builderFieldType.getDeclaredMethod("setFirstName", String.class);
            getFirstNameMethod.invoke(bulderField.get(house), "Sasha");

            System.out.println(house);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main2(String[] args) {
        Person person = new Person("Vasya", "Pupkin", 43);
        Person person2 = new Person("Petr", "Sidorov", 23);
        Class<?> clazz = person.getClass();

        try {
            Method getFirstNameMethod = clazz.getDeclaredMethod("getFirstName");
            //person.getFirstName();
            System.out.println(getFirstNameMethod.invoke(person));
            System.out.println(getFirstNameMethod.invoke(person2));

            Method setFirstNameMethod = clazz.getDeclaredMethod("setFirstName", String.class);
            //person.setFirstName("Sasha");
            setFirstNameMethod.invoke(person, "Sasha");
            System.out.println(person);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main1(String[] args) {
        //Class<?> clazz = String.class;
        Class<?> clazz = Person.class;

        //getClassInfo(clazz);

        for (Class<?> cl : String.class.getDeclaredClasses()) {
            System.out.println(cl);
        }
    }

    private static void getClassInfo(Class<?> clazz) {
        System.out.println(clazz.getName());
        System.out.println("----------");
        for (Constructor<?> c : clazz.getConstructors()) {
            System.out.println(c);
        }

        System.out.println("----------");
        for (Constructor<?> c : clazz.getDeclaredConstructors()) {
            System.out.println(c);
        }

        System.out.println("==========");
        for (Method m : clazz.getMethods()) {
            System.out.println(m);
        }

        System.out.println("----------");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m);
        }

        System.out.println("==========");
        for (Field f : clazz.getFields()) {
            System.out.println(f);
        }

        System.out.println("----------");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f);
        }
    }
}
