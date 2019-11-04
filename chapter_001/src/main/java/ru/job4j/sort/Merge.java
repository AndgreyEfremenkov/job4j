package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (index < rsl.length) {
            if (i == left.length && j < right.length) {
                rsl[index] = right[j];
            }
            if (j == right.length && i < left.length) {
                rsl[index] = left[i];
            }
            if (i < left.length && j < right.length && left[i] < right[j]) {
                rsl[index] = left[i];
                i++;
            } else if (j < right.length) {
                rsl[index] = right[j];
                j++;
            }
            index++;
        }

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}