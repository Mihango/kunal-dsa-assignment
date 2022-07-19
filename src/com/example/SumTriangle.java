package com.example;

import java.util.Arrays;

// https://www.geeksforgeeks.org/sum-triangle-from-array/
/**
 * Given an array [ 1, 2, 3], print the sum of triagle
 *
 *  7           => 2 + 5
 *  2, 5        => 1+2, 2+3
 *  1, 2, 3
 */
public class SumTriangle {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printTriangle(arr);
    }

    static void printTriangle(int[] arr) {
        if(arr.length == 0) return;

        int[] temp = new int[arr.length - 1];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}
