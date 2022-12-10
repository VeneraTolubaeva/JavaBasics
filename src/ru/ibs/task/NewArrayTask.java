package ru.ibs.task;

import java.util.ArrayList;
import java.util.List;

public class NewArrayTask {
    public static void main(String[] args) {
        List<Integer> numArrList = new ArrayList<>();
        numArrList.add(1);
        numArrList.add(2);
        numArrList.add(3);
        numArrList.add(4);
        numArrList.add(3);
        numArrList.add(5);

        System.out.println("Оригинал: " + numArrList.toString());

        while (numArrList.remove(Integer.valueOf(3)));

        System.out.println("Новый список: " + numArrList.toString());
    }
}
