package ru.ibs.day2.cycles;

public class WhileCycle {
    public static void main(String[] args) {
        int n = 0;
        // Условие может быть любым boolean выражением
        while (n < 5) {
            System.out.println(n);
            n += 2;
        }
        System.out.println("The end");
    }

}
