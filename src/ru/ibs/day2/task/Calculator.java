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
                int c = MathActions.minus(a, b);
                System.out.println(a + "-" + b + "=" + c);
                break;
            case "*":
                int c = MathActions.increase(a, b);
                System.out.println(a + "*" + b + "=" + c);
                break;
            case "/":
                int c = MathActions.division(a, b);
                System.out.println(a + "/" + b + "=" + c);
                break;
            case "!":
                int c = MathActions.factorial1(a); // можно поменять на factorial2 для решения вторым способом
                System.out.println(a + "! = " + MathActions.factorial1(a));
                break;
            default:
                System.out.println("Action \"" + action + "\" is not supported");
        }
        for (int a = 0; a < 10; a++){
            if (a < 0) break;

        }
    }
}
