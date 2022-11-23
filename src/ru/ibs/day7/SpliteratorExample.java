package ru.ibs.day7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(3, 5, -1, 2, 19, 4, 12, 14));
        Spliterator<Integer> sp1 = set.spliterator();
        Spliterator<Integer> sp2 = sp1.trySplit();
        sp1.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("======");
        sp2.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }

    public static void main1(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(3, 5, -1, 2, 19, 4));
        Spliterator<Integer> sp1 = set.spliterator();
        sp1.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
