package ru.ibs.day9;

import ru.ibs.task.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

public class WorkWithLambdas {
    interface SingleArgumentFunction<T, R> {
        R apply(T t);
    }
    public static void main(String[] args) {
        // How to make function return nothing (void)
        SingleArgumentFunction<Integer, Void> function;

        class N {
            int n;
        }
        N instance = new N();
        instance.n = 10;
        int res = mathOperation((a, b) -> {
            instance.n += a + b;
            return a + b + instance.n;
        });
        System.out.println(res);
    }

    public static void main1(String[] args) {
        System.out.println(mathOperation(Math::max));
        System.out.println(mathOperation2(Math::min));

        usePerson(Person::new);
        usePerson(() -> new Person("Ivan", "Petrov", 23));

        List<Integer> list = Arrays.asList(4, 3, 5, 12, 7);
        list.forEach(System.out::println);
    }

    private static int mathOperation(ToIntBiFunction<Integer, Integer> oper) {
        return oper.applyAsInt(4, 6);
    }

    private static int mathOperation2(BinaryOperator<Integer> operator) {
        return operator.apply(4, 6);
    }

    private static void usePerson(Supplier<Person> supplier) {
        Person person = supplier.get();
        person.setAge(43);
        System.out.println(person);
    }
}
