package ru.ibs.day6.list;

import java.util.Iterator;

public class ItemIterator implements Iterator<Item> {

    private Item root;

    public ItemIterator(Item root) {
        this.root = root;
    }

    @Override
    public boolean hasNext() {
        return root != null;
    }

    @Override
    public Item next() {
        Item result = root;
        root = root.next;
        return result;
    }
}
