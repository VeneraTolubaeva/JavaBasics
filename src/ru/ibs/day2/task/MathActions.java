package ru.ibs.day2.task;

public class MathActions {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int increase(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
    public static int factorial1(int a){
        if (a < 0) return 0;
        if (a == 0) return 1;
        if (a <= 2) return a;
        int result = 2;

        for (int n = 3; n < a; n++) {
            result *= n;
        }
          return result;
    }
    // вызывать функцию внутри себя (рекурсия) это не самый лучший вариант, так как съедает больше памяти,
    // но некоторые задачи без рекурсию решаются очень сложно или не решаются вообще
    public static int factorial2(int a) {
        if (a < 0) return 0;
        if (a == 0) return 1;
        return a * factorial2(a - 1);
    }
}
