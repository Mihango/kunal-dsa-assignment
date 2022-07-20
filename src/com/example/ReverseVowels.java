package com.example;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {

    public static void main(String[] args) {

        System.out.println("Data >>>> " + reverseVowels("aA"));
//        System.out.println("Data >>>> " + reverseVowels("leetcode"));
    }


    public static String reverseVowels(String s) {
        Set<Character> vowels = getVowels();
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < arr.length && !vowels.contains(arr[left]))
                left++;
            while (left < right && !vowels.contains(arr[right]))
                right--;

            if (right >= 0 && left < s.length() && left < right) {
                // vowels gotten
                char c = arr[left];
                arr[left] = arr[right];
                arr[right] = c;

                left++;
                right--;
            }
        }

        StringBuilder sb = new StringBuilder();

        // Creating a string using append() method
        for (char c : arr) {
            sb.append(c);
        }

        return sb.toString();
    }

    private static Set<Character> getVowels() {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        return set;
    }
}
