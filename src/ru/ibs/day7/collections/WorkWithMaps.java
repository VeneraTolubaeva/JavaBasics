package ru.ibs.day7.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class WorkWithMaps {
    public static class Data {
        public String s;

        public Data(String s) {
            this.s = s;
        }

        @Override
        public String toString() {
            return "(" + s + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return Objects.equals(s, data.s);
        }

        // Very bad implementation, but better than nothing
        /*public int hashCode() {
            return 0;
        }*/

        @Override
        public int hashCode() {
            return Objects.hash(s);
        }
    }

    public static void main(String[] args) {
        Map<Object, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put("2", "Two");
        System.out.println(map);
    }

    public static void main1(String[] args) {
        Data data1 = new Data("One");
        Data data2 = new Data("One");
        System.out.println(data1.equals(data2));
        Map<Data, String> map = new HashMap<>();
        map.put(data1, "value 1");
        map.put(new Data("Two"), "value 2");
        map.put(data2, "value 3");
        System.out.println(map);

        // Map keys SHOULD be not mutable
        data1.s = "Some new super value";
        System.out.println(map);
        System.out.println(map.get(data1));
    }
}
