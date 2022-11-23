package ru.ibs.day8.lambdas;

import java.util.List;

@FunctionalInterface
public interface ListOperation {
    int operation(List<Integer> list);
}
