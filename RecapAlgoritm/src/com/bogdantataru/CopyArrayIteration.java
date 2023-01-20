package com.bogdantataru;


import java.util.Arrays;

//  copy an array by iterating the array
public class CopyArrayIteration {

    public static void main(String[] args) {

        int[] array = new int[] {114, 132, 119, 91, 84, 29, 61, 76, 38, 21, 9, 63, 45, 68, 81, 124, 118, 78, 44, 59, 80};
        System.out.println(Arrays.toString(new CopyArrayIteration().solution(array)));


    }

    public int[] solution (int[] input) {

        int[] result = new int[input.length];


        for (int i = 0; i < input.length; i++) {

            result[i] = input[i];
        }
        return result;
    }
}
