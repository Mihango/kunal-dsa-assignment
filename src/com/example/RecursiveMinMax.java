package com.example;

//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

import java.util.Arrays;

/**
 * Use recursion to find main and min value of an array
 */
public class RecursiveMinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int[] results = {arr[0], arr[0]};
        minMax(arr, results, 1);
        System.out.println(Arrays.toString(results));
    }

    static void minMax(int[] data, int[] results, int index) {
        if (index == data.length) return;

        if (data[index] < results[0]) results[0] = data[index];
        else if (data[index] > results[1]) results[1] = data[index];

        minMax(data, results, index + 1);
    }
}
