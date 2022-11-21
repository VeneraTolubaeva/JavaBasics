package ru.ibs.day6;

import ru.ibs.day6.comparators.AgeComparator;
import ru.ibs.day6.comparators.FirstNameComparator;
import ru.ibs.task.Person;

import java.util.Arrays;
import java.util.Random;

public class WorkWithArrays {
    public static void main(String[] args) {
        int [] a = {4, 6, 1, 3};
        int [] b = {4, 6, 1, 3};
        int [] c = {6, 4, 1, 3};
        int [] d = {6, 4, 1, 3, 0};

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.equals(c, d));

        int[] copyA = new int[6];

        System.arraycopy(a, 0, copyA, 1, a.length);
        System.out.println(Arrays.toString(copyA));
    }

    public static void main1(String[] args) {
        Random random = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) + 1;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Person[] people = new Person[4];
        people[0] = new Person("Ivan", "Petrov", 34);
        people[1] = new Person("Vasilisa", "Sidorova", 23);
        people[2] = new Person("Vasilii", "Bolshakov", 65);
        people[3] = new Person("Sergey", "Bolshakov", 54);
        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, new FirstNameComparator());
        System.out.println(Arrays.toString(people));

        Arrays.sort(people, new AgeComparator());
        System.out.println(Arrays.toString(people));
    }
}
