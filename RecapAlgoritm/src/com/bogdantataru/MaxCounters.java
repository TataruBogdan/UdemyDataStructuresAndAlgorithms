package com.bogdantataru;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {

        int[] m = {3,4,4,4,1,4,4,};

        System.out.println(Arrays.toString(solution(5, m)));

    }

    //         // size of counters / array of instructions
    public static int[] solution(int n, int[] a) {

        // create an array of size n
        int[] arrayOfCounters = new int[n];
        int startLine = 0;
        int currentMax = Integer.MIN_VALUE;
        // for each value in array of instructions we need to increment the position of counter by one
        for (int i = 0; i < a.length; i++) {
            // need to count the biggest count so far
            arrayOfCounters[a[i] -1 ] += 1;
        }
        for (int counter: arrayOfCounters) {
            if (currentMax < counter)
            currentMax = counter;
        }
        return arrayOfCounters;
    }


    
}
