package com.bogdantataru;

// Triple Sum hackerrank problem

// Given an array and a value, find if there is a triplet in array whose sum is equal to the given value.
// If there is such a triplet present in array, then print the triplet and return true. Else return false.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripleSum {

    public static void main(String[] args) {

        int[] a = {3, 5, 7, 7, 1, 1};
        int[] b = {7, 5, 9};
        int[] c = {7, 9, 11, 11, 13};

        System.out.println(TripleSum.triplets(a, b, c));
    }

    public static long triplets(int[] a, int[] b, int[] c) {

        long distanceTripletCount = 0;

        int[] distinctA = removeDuplicates(a);
        int[] distinctB = removeDuplicates(b);
        int[] distinctC = removeDuplicates(c);

        // we need to sort the array
        Arrays.sort(distinctA);
        Arrays.sort(distinctB);
        Arrays.sort(distinctC);

        // because we have p<=q and q>=r
        // we search how many elements are smaller or equal then q into distinctA
        // we search how many element are bigger or equal then q into distinctC
        for (int q : distinctB) {
            int validIndexC1 = getValidIndex(distinctA, q) + 1;
            int validIndexC3 = getValidIndex(distinctC, q) + 1;
            distanceTripletCount += validIndexC1 * validIndexC3;
        }

        return distanceTripletCount;
    }

    private static int[] removeDuplicates(int[] array) {

        Set<Integer> set = new HashSet<>();
        //transform the array into set - remove duplicate items
        for (int item : array) {
            set.add(item);
        }

        //transform the set back into array
        int size = set.size();

        int[] arrayNoDuplicates = new int[size];
        int i = 0;
        for (int item: set ) {
            arrayNoDuplicates[i++] = item;
        }

        return arrayNoDuplicates;

    }

    // we do a binary search to see how many element are smaller or bigger that the q
    private static int getValidIndex(int[] input, int key) {

        int low = 0;
        int high = input.length - 1;
        int count = -1; // because index starts at 0

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (input[middle] <= key) {
                count = middle;
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return count;
    }

}
