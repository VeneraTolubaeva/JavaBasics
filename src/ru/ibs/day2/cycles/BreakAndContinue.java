package ru.ibs.day2.cycles;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3)
                continue;
            System.out.println(i);
        }
        System.out.println("***********");
        int n = 0;
        while (n < 5) {
            if (n == 3) {
                break;
            }
            System.out.println(n);
            n += 1;
        }
        System.out.println("*********");

        for (int i = 0; i < 5; i++) {
            if (i == 3) continue;
            for (int j = 0; j < 5; j++) {
                if (j == 1) continue;
                if (j == 3) break;
                System.out.println(i + "" + j);

            }
        }
    }
}
