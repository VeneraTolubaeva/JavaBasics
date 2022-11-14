package ru.ibs.day1.operations;
// Побитовые операции &, |, ^
public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 10; // 1010
        int b = 3;  //0011

        System.out.println("a & b ? " + (a & b));
        System.out.println("a | b ? " + (a | b));
        System.out.println("a ^ b ? " + (a ^ b));

        System.out.println("~a = " + (~a));
        System.out.println("*****************************");

        // Switch a and b
        // classic:
        int t = a;
        a = b;
        b = t;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //bitwise
        b = a ^ b;
        a = a ^ b;
        b = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("b << 2 = " + (b << 2));
        System.out.println("a >> 1 = " + (a >> 1));
    }
}

/*
a b & | ^
1 0 0 1 1
0 0 0 0 0
1 1 1 1 1
0 1 0 1 1

~ меняет знак числа и меняет в битах 1 на 0, а 0 на единицу
 */