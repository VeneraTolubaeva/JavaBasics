package ru.ibs.day1.control;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        System.out.println("The end");
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();

        if (n % 3 == 0)
            System.out.println(n + " could be divided by 3");

        System.out.println("The end");
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();

        if (n % 2 == 0)
            System.out.println(n + " could be divided by 2");
        else if (n % 3 == 0){
            System.out.println(n + " could be divided by 3");
        } else {
            System.out.println(n + " is not divided");
        }

        System.out.println("The end");
    }
}
