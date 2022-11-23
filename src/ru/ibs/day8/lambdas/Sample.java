package ru.ibs.day8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Sample {
    private List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 4, 1));

    public int operation(ListOperation operation) {
        return operation.operation(list);
    }

    public int function(Function<List<Integer>, Integer> operation) {
        return operation.apply(list);
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        int res = sample.operation((list) -> {
            int result = Integer.MIN_VALUE;
            for (Integer n : list) {
                if (n > result)
                    result = n;
            }
            return result;
        });
        System.out.println(res);
        res = sample.function(list-> {
            int result = 0;
            for (int n : list) {
                result += n;
            }
            return result;
        });
        System.out.println(res);
    }
}
