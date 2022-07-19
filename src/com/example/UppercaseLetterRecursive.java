package com.example;

public class UppercaseLetterRecursive {
    public static void main(String[] args) {
        String input = "geeksforgeeKs";
        System.out.println(searchUppercase(input, 0));
    }

    private static Character searchUppercase(String input, int index) {
        if (index == input.length()) return null;

        if (Character.isUpperCase(input.charAt(index)))
            return input.charAt(index);

        return searchUppercase(input, index + 1);
    }
}
