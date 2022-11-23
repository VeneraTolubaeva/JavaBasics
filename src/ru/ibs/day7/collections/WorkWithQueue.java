package ru.ibs.day7.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class WorkWithQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(3);
        queue.addAll(Arrays.asList(4, 7, 1, 3));
        System.out.println(queue);
        queue.offer(6);
        System.out.println(queue);
        System.out.println("Remove: " + queue.remove());
        System.out.println(queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println(queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println(queue);
    }
}
