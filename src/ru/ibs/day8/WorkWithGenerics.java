package ru.ibs.day8;

import ru.ibs.day7.generics.Box;
import ru.ibs.day8.generic.A;
import ru.ibs.day8.generic.B;
import ru.ibs.day8.generic.GenericMethod;

import java.util.ArrayList;
import java.util.List;

public class WorkWithGenerics {
    public static void main(String[] args) {
        List<B> listB = new ArrayList<>();
        List<? extends A> listA = listB;
        // Error: attempt to add instance of A into the list of B
        // but A IS-NOT-A B
        //listA.add(new A());
    }

    public static void main2(String[] args) {
        Box<? extends Number> box1 = getBox();
        // Error
        //box1.setItem(5);

        Box<? super Number> box2 = getNumberBox();
        box2.setItem(5);
    }

    public static Box<? super Number> getNumberBox() {
        return new Box<>(4);
    }

    public static Box<? extends Number> getBox() {
        //return new Box<>("Hello");
        return new Box<>(4);
    }

    public static void main1(String[] args) {
        GenericMethod gm = new GenericMethod();
        System.out.println(gm.compare("a", "b"));
        System.out.println(gm.compare(3, 1));
        // Error: Integer is not comparable to String
        //System.out.println(gm.compare(1, "s"));

        // Error: Item is not comparable
        //System.out.println(gm.compare(new Item(2), new Item(4)));

        System.out.println(gm.max(4, 5));
        System.out.println(gm.max(3.4, 2.12));
    }
}
