package com.example;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 9, 10};
        int target = 10;
        System.out.println(binarySearchRec(arr, target, 0, arr.length - 1));
    }

    private static int binarySearchRec(int[] arr, int target, int start, int end) {
        if(start > end) return -1;

        int mid = start + (end - start) / 2;

        if(target == arr[mid]) return mid;
        else if (target > arr[mid]) return binarySearchRec(arr, target, mid+1, end);
        else return binarySearchRec(arr, target, start, mid-1);
    }
}
