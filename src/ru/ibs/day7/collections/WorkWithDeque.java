package ru.ibs.day7.collections;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class WorkWithDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>(Arrays.asList(5, 1, 3, 32));
        deque.offer(1);
        System.out.println(deque);
        deque.offerLast(7);
        System.out.println(deque);
        deque.offerFirst(11);
        System.out.println(deque);

        System.out.println("Peek: " + deque.peek());
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());
        System.out.println(deque);

        System.out.println("Poll: " + deque.poll());
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());
        System.out.println(deque);
    }
}
