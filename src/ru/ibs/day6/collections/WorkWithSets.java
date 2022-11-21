package ru.ibs.day6.collections;

import java.util.HashSet;
import java.util.Set;

public class WorkWithSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(6);
        set.add(null);
        set.add(2);
        System.out.println(set.size());
        System.out.println("------");

        for (Integer n : set) {
            System.out.println(n);
        }
        System.out.println("------");

        Set<Integer> toAdd = new HashSet<>();
        toAdd.add(5);
        toAdd.add(43);
        toAdd.add(12);
        set.addAll(toAdd);
        for (Integer n : set) {
            System.out.println(n);
        }
        System.out.println("------");
        System.out.println(set.contains(2));
        System.out.println(set.contains(111));
        System.out.println("------");
        System.out.println(set.remove(2));
        System.out.println(set.remove(111));
        for (Integer n : set) {
            System.out.println(n);
        }
        System.out.println("------");
        System.out.println(set.containsAll(toAdd));
        Set<Integer> remove = new HashSet<>(set);
        Set<Integer> retain = new HashSet<>(set);
        remove.removeAll(toAdd);
        for (Integer n : remove) {
            System.out.println(n);
        }
        System.out.println("------");

        toAdd.add(111);
        retain.retainAll(toAdd);
        for (Integer n : retain) {
            System.out.println(n);
        }
        System.out.println("------");
        Integer[] arr = set.toArray(new Integer[]{});
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
