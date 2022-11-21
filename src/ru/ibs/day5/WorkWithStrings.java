package ru.ibs.day5;

import ru.ibs.task.Person;

import java.util.Locale;

public class WorkWithStrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World! ");
        sb.append(new Person("Vasya", "Pupkin", 45));
        sb.append(new Object());
        System.out.println(sb);
    }

    public static void main1(String[] args) {
        String s = new String("Hello");
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
        System.out.println(s1.intern() == s1.intern());

        System.out.println("----------");
        System.out.println("First symbol is: " + s.charAt(0));
        System.out.println(s.codePointBefore(1));
        System.out.println(s.codePointCount(2, 5));
        System.out.println(s.indexOf("l", 3));
        System.out.println(s.indexOf("qwe"));
        System.out.println("----------");

        s2 = "hello";
        // s1 < s2 -> x < 0
        // s1 == s2 -> 0
        // s1 > s2 -> x > 0
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println("----------");
        String num1 = "123-4567";
        String num2 = "123-45-67";
        String regex = "\\d{3}-\\d{4}";
        System.out.println(num1.matches(regex));
        System.out.println(num2.matches(regex));
        System.out.println(s.replace('x', 'A'));
        System.out.println(s.replace("ll", "II"));
        System.out.println(s.replaceAll("o", "a"));
        System.out.println("----------");
        String[] arr = s.split("l");
        for (String str : arr) {
            System.out.println("'" + str + "'");
        }
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 4));

        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println(s.toLowerCase());
    }
}
