package ru.ibs.day6.list;

import java.util.Iterator;

public class WorkWithList {
    public static void main(String[] args) {
        ItemList list = new ItemList();
        list.add(new Item(1));
        list.add(new Item(2));
        list.add(new Item(3));
        list.add(new Item(4));
        for (Item item : list) {
            System.out.println(item.payload);
        }
        list.reverse();
        System.out.println("-----------");
        for (Item item : list) {
            System.out.println(item.payload);
        }
    }

    public static void main1(String[] args) {
        Item root = new Item(1);
        root.next = new Item(2);
        root.next.next = new Item(3);

        Item cur = root;

        while (cur != null) {
            System.out.println(cur.payload);
            cur = cur.next;
        }

        Iterator<Item> iterator = new ItemIterator(root);
        while (iterator.hasNext()) {
            System.out.println(iterator.next().payload);
        }
    }
}
