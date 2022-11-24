package ru.ibs.day9;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkWithStreams {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2, 4, 5));
        list.add(Arrays.asList(1, 3, 7));

        // With stream.flatMap
        List<Integer> streamResult = list.stream()
                .flatMap((Function<List<Integer>, Stream<Integer>>) Collection::stream)
                .collect(Collectors.toList());
        System.out.println(streamResult);

        // Without streams
        List<Integer> result = new ArrayList<>();
        for (List<Integer> elem : list) {
            result.addAll(elem);
        }
        System.out.println(result);
    }

    public static void main2(String[] args) {
        Stream<String> stream = Stream.of("One", "Two", "Three");
        Collection<String> set = stream.sorted().collect(Collectors.toList());
        System.out.println(set);

        int[] arr = {3, 4, 6, 1, 4};
        IntStream ints = Arrays.stream(arr);
        Set<Integer> intSet = ints.filter(n -> n % 2 == 0).collect(
                HashSet::new,
                HashSet::add,
                AbstractCollection::addAll
        );
        intSet.forEach(System.out::println);
    }

    public static void main1(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1);
        int n = list.stream().reduce((a, b) -> a + b).get();
        System.out.println(n);
        n = list.stream().reduce((a, b) -> a > b ? a : b).get();
        // a > b ? a : b
        // the same as
        // if (a > b) return a else return b;
        System.out.println(n);
        System.out.println("----------");
        list.stream().map(i -> i * i).forEach(System.out::println);
        System.out.println("----------");
        list.stream().map(i -> "Number " + i).forEach(System.out::println);
        System.out.println(list.stream().allMatch(i -> i == 3));
        System.out.println(list.stream().anyMatch(i -> i == 3));
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        System.out.println(list.stream().filter(i -> i == 5 || i == 7).findAny().get());
        System.out.println("----------");
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("----------");
        list.stream().sorted((a, b) -> {
            if (a == 5) {
                return -1;
            }
            if (b == 5) {
                return 1;
            }
            return a - b;
        }).forEach(System.out::println);

        System.out.println("----------");
        Collection<Integer> set = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}
