package com.bogdantataru;

import java.util.Arrays;

public class FrequencyTable {

    public static void main(String[] args) {

        int[] agesOfStudents = {5, 7, 5, 9, 7, 7, 6, 9, 9, 9, 10, 12, 12, 7};

        System.out.println(Arrays.toString(FrequencyTable.solution(agesOfStudents)));

    }


    //return array with age frequencies
    public static int[] solution(int[] inputArray) {

        // initialize the fr array
        int[] fr = new int[inputArray.length];
        // this was already visited ???
        int visited = -1;
        for (int i = 0; i < inputArray.length - 1; i++) {
            // for each element in inputArray take a count to see how many times we find the element
            int count = 1;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    count++;
                    // avoid counting the same element again
                    fr[j] = visited; //????
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        for (int i = 0; i < fr.length; i++) {
            if (fr[i]!=visited)
                System.out.println("  " + inputArray[i] + "  |   " + fr[i]);
        }
        return fr;

    }


}
