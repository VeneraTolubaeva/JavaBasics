package ru.ibs.day2;

import java.math.BigDecimal;
import java.math.MathContext;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 1;
        char c1 = 65;
        char c2 = 'A';
        short sh = 1;
        int n = 1;
        long l = 3_000_000_000L;

        sh = b; // valid
        // Failure by default: int (32 bit), long (64 bit)
        //n = l;

        n = (int) l;
        System.out.println(n);

        double pi = 3.14;
        float e = 2.71F;
        float e1 = (float) 2.71;

        float fl = 1.0F / 3;
        System.out.printf("%1.20f%n", fl);
        double dl = 1.0 / 3;
        System.out.printf("%1.20f\n", dl);
        double dl2 = fl;
        System.out.printf("%1.20f\n", dl2);
        // Always false
        //System.out.println(dl == dl2);
        double delta = 0.000000000001;
        System.out.println(Math.abs(dl - dl2) < delta);

        BigDecimal db = BigDecimal.valueOf(1.0).divide(BigDecimal.valueOf(3.0), new MathContext(20));
        System.out.println(db);

    }
}