package com.bogdantataru;

import java.util.Arrays;

public class MaxCountersSchool {

    public static void main(String[] args) {

        int[] m = {3,4,4,4,1,4,4,};

        System.out.println(Arrays.toString(new MaxCountersSchool().solution(5, new int[] {3, 4, 4, 6, 1, 4, 4})));

    }
    //  1   2   3   4   5
    //  0   0   0   0   0
    // increase(3)
    // increase(4)
    // increase(4)
    //  1   2   3   4   5
    //  0   0   1   2   0
    // maxCounter(2)

                        // n - all counters are set to the maximum value of any counter.
    public int[] solution(int n, int[] A) {

        int[] counters = new int[n]; //construct our array of counters.  array of type integer of size n.
        Arrays.fill(counters, 0); //  filling these counters with zeros.
        int startLine = 0; // create a variable called start line representing our moving start line
        int currentMax = 0; // will hold the value of our maximum counter.
        // start a loop iterating over every single instruction that we receive in array A
        for (int instruction : A) {
            // we decrease i by 1 because i is pointing to a counter ID starting from 1. However, our array starts from zero
            // X will be our pointer pointing to each counter in our array.
            int x = instruction - 1; // Counter starts with 1 - we decrease i by one.
            if (instruction > n) startLine = currentMax; // if the instruction that we have received is a max counter instruction. move the start line and we set the start line to be the current max.
            else if (counters[x] < startLine) counters[x] = startLine + 1; // if we need to increment a counter that is behind the start line. counter at position x is less than the start line.set the counter value to be at the start line plus 1.
            else counters[x] += 1; // when the counter is ahead of the start line.  increment the value of that counter by 1.
            // keep track of our maximum value of the counter and whether the current value of the counter that we're currently modifying is greater than the current max
            if (instruction <= n && counters[x] > currentMax) currentMax = counters[x]; //  keep track of our maximum value of the counter.
        }
        // set any counters that are behind the start line to be the value of at least the start line.
        for (int i = 0; i < counters.length; i++)
            if (counters[i] < startLine) counters[i] = startLine;
        return counters;
    }
}
