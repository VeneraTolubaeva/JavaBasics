package ru.ibs.task;

import java.util.LinkedList;
import java.util.List;

public class NewLinkedTask {
    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(3);
        numList.add(5);

        System.out.println("Оригинал: " + numList.toString());

        for (int i = 0; i < 10; i++) {
            if (numList.contains(3)) {
                int ind = numList.indexOf(3);
                numList.remove(ind);
            }
        }

        System.out.println("Новый список: " + numList.toString());
    }

}
