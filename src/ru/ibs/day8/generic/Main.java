package ru.ibs.day8.generic;

import java.util.List;

public class Main {
    // How to get rid of "unchecked cast" warnings:
    // 1. Use "SuppressWarnings" annotation
    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        System.out.println(gm.listOfA() instanceof List);
        List<A> list = (List<A>) gm.listOfA();

        String hello = (String) gm.helloString();

        // 2. OR Wrap generic type into non-generic
        List<A> list1 = (ListOfA) gm.listOfAV2();
    }
}
