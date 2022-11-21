package ru.ibs.day6.list;

import java.util.Iterator;

public class ItemList implements Iterable<Item>{

    private Item root;

    public void reverse() {
        root = reverseInternal(null, root);
    }

    private Item reverseInternal(Item prev, Item cur) {
        if (cur == null) {
            return prev;
        }

        Item next = cur.next;
        cur.next = prev;
        return reverseInternal(cur, next);
    }

    public void add(Item item) {
        if (root == null) {
            root = item;
        } else {
            Item last = root;
            while (last.next != null) {
                last = last.next;
            }
            last.next = item;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new ItemIterator(root);
    }
}
