package ru.ibs.task;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NewStreamTask {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);

        System.out.println("Оригинал: " + list.toString());

        Stream<Integer> stream = list.stream();
        Predicate<Integer> predicate;
        predicate = (n) -> n != 3;
        Stream<Integer> newList = stream.filter(predicate);
        Iterator<Integer> testList = newList.iterator();

        System.out.println("Новый список: ");
        while (testList.hasNext())
            System.out.print(testList.next() + " ");
    }

}
