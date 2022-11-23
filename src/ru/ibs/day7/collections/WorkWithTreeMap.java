package ru.ibs.day7.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorkWithTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map);
        System.out.println("Put with key = 1: " + map.put(1, "New value"));
        System.out.println(map);
        System.out.println("map.remove(1): " + map.remove(1));
        System.out.println("map.remove(11): " + map.remove(11));
        System.out.println("map.remove(2, 'three'): " + map.remove(2, "three"));
        System.out.println(map);
        // null keys are not allowed for TreeMap
        //map.put(null, "Null value");
        System.out.println(map);
        System.out.println("map.containsKey(2): " + map.containsKey(2));
        System.out.println("map.containsValue('One'): " + map.containsValue("One"));
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        map.put(4, "Two");
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        System.out.println(map);
        System.out.println(values);
        System.out.println("map.getOrDefault(2, 'default'): " + map.getOrDefault(2, "default"));
        System.out.println("map.getOrDefault(21, 'default'): " + map.getOrDefault(21, "default"));
        Map<Integer, String> toAdd = new HashMap<>();
        toAdd.put(22, "Hello");
        toAdd.put(33, "Anoter value");
        map.putAll(toAdd);
        System.out.println(map);
        System.out.println("Size: " + map.size());
        System.out.println(map.replace(22, "Something"));
        System.out.println(map.replace(2, "Three", "Fifteen"));
        System.out.println(map);
        map.clear();
        System.out.println(map.isEmpty());
    }
}
