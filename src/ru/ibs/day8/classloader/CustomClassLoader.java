package ru.ibs.day8.classloader;

import java.io.FileInputStream;

public class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (name.equals("ru.ibs.ru.ibs.day7.classloader.Storage")) {
            try (FileInputStream fis = new FileInputStream("files/Storage.data")) {
                byte[] data = fis.readAllBytes();
                return defineClass(name, data, 0, data.length);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return super.findClass(name);
    }
}
