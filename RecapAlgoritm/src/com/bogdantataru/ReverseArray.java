package com.bogdantataru;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };

        System.out.println("Original Array " + Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(new ReverseArray().solution(myIntArray)));

    }

    public int[] solution (int[] input) {

        int temp;
        int arraySize = input.length;

        for (int i = 0; i < arraySize/2 ; i++) {
            temp = input[i];
            input[i] = input[arraySize - (i +1)];
            input[arraySize - (i + 1)] = temp;
        }
        return input;
    }



}
