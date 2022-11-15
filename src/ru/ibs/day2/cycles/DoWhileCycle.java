package ru.ibs.day2.cycles;

public class DoWhileCycle {
    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.println(n);
            n += 2;
        } while (n < 5);
        System.out.println("The end");
    }
}
