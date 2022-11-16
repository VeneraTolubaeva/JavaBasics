package ru.ibs.day2.task;

import java.util.Scanner;
import ru.ibs.day2.task.MathActions;

public class Calculator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an action (+ - * / !): ");
        String action = scanner.next();

        System.out.println("Please enter a: ");
        int a = Integer.parseInt(scanner.next());
        System.out.println("Please enter b: ");
        int b = Integer.parseInt(scanner.next());

        switch (action) {
            case "+":
                int c = MathActions.sum(a, b);
                System.out.println(a + "+" + b + "=" + c);
                break;
            case "-":
                c = MathActions.minus(a, b);
                System.out.println(a + "-" + b + "=" + c);
                break;
            case "*":
                c = MathActions.multiply(a, b);
                System.out.println(a + "*" + b + "=" + c);
                break;
            case "/":
                c = MathActions.divide(a, b);
                System.out.println(a + "/" + b + "=" + c);
                break;
            case "!":
                c = MathActions.factorial1(a); // можно поменять на factorial2 для решения вторым способом
                System.out.println(a + "! = " + MathActions.factorial1(a));
                break;
            default:
                System.out.println("Action \"" + action + "\" is not supported");
        }
    }
}
