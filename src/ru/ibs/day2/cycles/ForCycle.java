package ru.ibs.day2.cycles;

public class ForCycle {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
        System.out.println("The end");
    }
    public static void main1(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
