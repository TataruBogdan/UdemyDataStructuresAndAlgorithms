package com.bogdantataru;

public class MaxNonOverlappingSegments {

    public static void main(String[] args) {

        int[] beginningArray = {1, 3, 7, 9, 9};
        int[] endingArray    = {5, 6, 8, 9, 10};

        // System.out.println(new MaxNonOverlappingSegments().solutionMy(beginningArray, endingArray));
        System.out.println(new MaxNonOverlappingSegments().solution(beginningArray, endingArray));

    }

    public int solution(int[] A, int[] B) {

        int lastEndSegment = -1;
        int chosenCount = 0;

        for (int activity = 0; activity < A.length; activity++) {

            int start = A[activity];
            if (start > lastEndSegment) {
                chosenCount ++;
                lastEndSegment = B[activity];
            }
        }
        return chosenCount;
    }


    // solution must be O(n)
    public int solutionMy (int[] A, int[] B) {

        //there is at least one activity
        int maximNumberNonOverlappingOfSegments = 0;

        // Two segments I and J, such that I ≠ J, are overlapping if they share at least one common point.
        // In other words, A[I] ≤ A[J] ≤ B[I] or A[J] ≤ A[I] ≤ B[J].
        // input is giving two arrays, this list of beginning and end is parameterised into two arrays A and array B
        // and each element in these two arrays represents one segment with a beginning the element at A and an end the element at B
        for (int activity = 1; activity < B.length; activity++) {
            // start is index of Array A
            int start = A[activity];
            // end is index of Array B
            int finish = B[activity-1];
            //each segment has a start and an end-ing point
            //  If the start time of this activity is greater than or equal to the finish time of the previously selected activity then select this activity and print it.

            if (start >= finish){
                maximNumberNonOverlappingOfSegments ++;
            }

        }

        return maximNumberNonOverlappingOfSegments;
    }




}
