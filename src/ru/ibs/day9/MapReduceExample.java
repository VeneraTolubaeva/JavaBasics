package ru.ibs.day9;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapReduceExample {
    public static void main(String[] args) {
        String[] lines = {
                "Java is a high level, class based, object - oriented programming language that is designed to have as",
                "few implementation dependencies as possible.It is a general -purpose programming language intended to",
                "let programmers write once, run anywhere(WORA), meaning that compiled Java code can run on all platforms",
                "that support Java without the need to recompile. Java applications are typically compiled to bytecode that",
                "can run on any Java virtual machine(JVM) regardless of the underlying computer architecture.The syntax of Java",
                "is similar to C and C++, but has fewer low - level facilities than either of them.The Java runtime provides",
                "dynamic capabilities (such as reflection and runtime code modification)that are typically not available in",
                "traditional compiled languages.As of 2019, Java was one of the most popular programming languages in use",
                "according to GitHub, particularly for client–server web applications, with a reported 9",
                "million developers"
        };
        Map<String, Integer> wordCound = Arrays.stream(lines)
                .map(s -> s.split("[ ,-.()]+"))
                .flatMap(Arrays::stream)
                .map(s -> new AbstractMap.SimpleEntry<>(s, 1))
                .reduce(
                        new HashMap<>(),
                        (map, entry) -> {
                            if (map.containsKey(entry.getKey())) {
                                int value = map.get(entry.getKey()) + entry.getValue();
                                map.put(entry.getKey(), value);
                            } else {
                                map.put(entry.getKey(), entry.getValue());
                            }
                            return map;
                        },
                        (m1, m2) -> {
                            m1.putAll(m2);
                            return m1;
                        }
                );
        wordCound.entrySet().forEach(System.out::println);
    }
}
