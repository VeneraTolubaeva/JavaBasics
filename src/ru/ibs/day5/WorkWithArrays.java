package ru.ibs.day5;

import ru.ibs.task.Person;

import java.util.Arrays;

public class WorkWithArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int arr2[] = {2, 6, 1, 3};

        arr1[1] = 56;

        for (int n : arr1) {
            System.out.println(n);
        }

        Person[] people = new Person[4];
        people[2] = new Person("Jack", "Smith", 45);
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println(arr2.length);
        System.out.println("===========");

        arr2 = Arrays.copyOf(arr2, 6);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("===========");
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
