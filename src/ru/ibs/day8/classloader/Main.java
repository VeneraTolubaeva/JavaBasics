package ru.ibs.day8.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> storageClass = Class.forName(
                    "ru.ibs.day8.classloader.Storage",
                    false,
                    new CustomClassLoader()
            );
            //System.out.println(storageClass);
            // 1.
            Constructor<?> constructor = storageClass.getDeclaredConstructor(String.class);
            Object storage = constructor.newInstance("Hello, World!");

            // 2.
            System.out.println(storage);

            // 3.
            Method setDataMethod = storageClass.getDeclaredMethod("setData", String.class);
            setDataMethod.invoke(storage, "Some data");

            // 4.
            Method getDataMethod = storageClass.getDeclaredMethod("getData");
            System.out.println(getDataMethod.invoke(storage));

            // 5.
            System.out.println(storage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        /*
        1.
        Storage storage = new Storage("Hello, World!");

        2.
        System.out.println(storage);

        3.
        storage.setData("Some data");

        4.
        System.out.println(storage.getData());

        5.
        System.out.println(storage);
        */
    }
}
