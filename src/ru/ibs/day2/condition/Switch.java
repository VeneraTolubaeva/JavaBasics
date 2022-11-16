package ru.ibs.day2.condition;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = scanner.next();

        /*
        Switch work with
        1. int
        2. String
        3. enum
         */

        switch (str) {
            case "winter":
                System.out.println("It is cold");
                break;
            case "summer":
                System.out.println("It is hot");
                break;
            default:
                System.out.println("Weather is fine");
        }
        System.out.println("The end");
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                /*System.out.println("n == 1");
                break;*/
            case 2:
                System.out.println("n is either 1 or 2");
                break;
            case 3:
                System.out.println("n == 3");
                break;
            default:
                System.out.println("n is not in (1, 2, 3)");
        }

        System.out.println("The end");
    }
}
