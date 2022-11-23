package ru.ibs.day8.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        A a = new A();
        Class<?> classA = a.getClass();
        Field[] fields = classA.getDeclaredFields();
        int result = 0;

        for (Field f : fields) {
            Annotation firstAnnotation = f.getDeclaredAnnotation(First.class);
            if (firstAnnotation != null) {
                Class<?> annotationType = firstAnnotation.annotationType();
                Method valueMethod = annotationType.getDeclaredMethod("value");
                String value = (String) valueMethod.invoke(firstAnnotation);
                switch (value) {
                    case "field b":
                        result += 2;
                        break;
                    case "Field c":
                        result += 3;
                        break;
                    default:
                        result += 1;
                }
            } else {
                f.setAccessible(true);
                f.set(a, result);
            }
        }

        System.out.println(a.getD());
    }
}
