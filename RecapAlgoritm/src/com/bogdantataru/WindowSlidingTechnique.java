package com.bogdantataru;

public class WindowSlidingTechnique {

    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400};
        int[] arr2 = {1, 4, 2, 11, 23, 3, 1, 0, 20};

        System.out.println(solution(16, arr2));

    }

    public static boolean solution (int total, int[] input) {

        int back = 0 ;
        int front = 0;
        int sum = input[back];
        for (front = 1; front < input.length -1; front++) {
            if (sum > total ) {
                sum = sum - input[back];
                back ++;
            } else if (sum < total) {
                sum += input[front];
            } else return true;
        }
        return false;
    }
}
