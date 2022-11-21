package ru.ibs.day6;

import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}};

        // equals - for single dimension array
        System.out.println(Arrays.equals(a, b));

        // deepEquals - for multi dimensional array
        System.out.println(Arrays.deepEquals(a, b));

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));
    }

    public static void main1(String[] args) {
        int[][] a = new int[3][4];
        int[][] b = {
                {1, 2, 3},
                {3, 4, 5}
        };
        int[][] c = new int[2][];

        System.out.println(Arrays.toString(a[0]));
        System.out.println(c[0]);

        c[0] = new int[3];
        c[1] = new int[]{2, 3, 4, 5, 6, 7};
        // ArrayIndexOutOfBoundsException {
        // System.out.println(c[0][4]);
        System.out.println(c[1][4]);

        String[][] strs = new String[3][];
        System.out.println(strs[0]);

        String[][] strs2 = new String[3][4];
        System.out.println(strs2[0][0]);
    }
}
