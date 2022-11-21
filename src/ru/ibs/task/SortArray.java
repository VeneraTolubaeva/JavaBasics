package ru.ibs.task;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = random.nextInt(20) + 1;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    //arr[i];
                }
            }
        }
    }
}
