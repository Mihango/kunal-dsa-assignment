package com.example;

public class StaircaseTraversal {
    public static void main(String[] args) {
        System.out.println(staircaseTraversal(4, 2));
    }

    public static int staircaseTraversal(int height, int maxSteps) {
        int sum = 0;
        for(int i = 1; i <= maxSteps;i++) {
            sum += helper(height, maxSteps, i);
        }
        return sum;
    }

    private static int helper(int height, int maxSteps, int curr) {
        int rem = height - curr;
        if(rem == 0) return 1;
        if(rem < 0) return 0;

        int sum = 0;
        for(int i = 1; i <= maxSteps;i++) {
            sum += helper(rem, maxSteps, i);
        }

        return sum;
    }
}
