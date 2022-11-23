package ru.ibs.day7.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class WorkWithLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(2);
        list.add(6);
        list.add(null);
        list.add(null);
        list.add(1);
        list.add(9);
        System.out.println("Size: " + list.size());
        printList(list);

        List<Integer> toAdd = new ArrayList<>(Arrays.asList(2, 23, 45));
        // Arrays.asList does not support element removal
        //List<Integer> toAdd = Arrays.asList(2, 23, 45);
        toAdd.add(55);
        toAdd.remove(Integer.valueOf(55));
        list.addAll(toAdd);
        printList(list);
        list.add(1, 78);
        printList(list);
        System.out.println("Remove by index: " + list.remove(1));
        System.out.println("Remove as object: " + list.remove(Integer.valueOf(2)));
        System.out.println("Remove as object: " + list.remove(Integer.valueOf(222)));
        printList(list);
        System.out.println("List contains 6? " + list.contains(6));
        System.out.println("List contains 67? " + list.contains(67));
        System.out.println(list.containsAll(toAdd));
        toAdd.add(55);
        System.out.println(list.containsAll(toAdd));
        List<Integer> remove = new ArrayList<>(list);
        List<Integer> retain = new ArrayList<>(list);
        remove.removeAll(toAdd);
        printList(remove);
        retain.retainAll(toAdd);
        printList(retain);
        System.out.println("Element with index 2: " + list.get(2));
        System.out.println("Index of value 6: " + list.indexOf(6));
        System.out.println("Index of value 67: " + list.indexOf(67));
        list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                if (Integer.valueOf(6).equals(integer))
                    return 7;
                return integer;
            }
        });
        printList(list);
        list.set(2, 42);
        list.set(3, 4);
        printList(list);
        list.sort(Comparator.naturalOrder());
        printList(list);
        List<Integer> sublist = list.subList(2, 6);
        printList(sublist);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }

    private static void printList(List<Integer> list) {
        for (Integer n : list) {
            System.out.print(n + ", ");
        }
        System.out.println("\n==========");
    }
}
