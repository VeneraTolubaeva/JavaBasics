package ru.ibs.day8.annotations;

import java.lang.annotation.Annotation;

public class InheritedAnnotation {
    public static void main(String[] args) {
        Class<?> ca = A.class;
        Class<?> cb = B.class;

        for (Annotation a : ca.getAnnotations()) {
            System.out.println(a);
        }

        System.out.println("--------");

        for (Annotation a : cb.getAnnotations()) {
            System.out.println(a);
        }
    }
}
