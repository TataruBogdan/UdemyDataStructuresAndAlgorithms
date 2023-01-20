package com.bogdantataru;

import java.util.*;

public class CountDistinctSlices {

    public static void main(String[] args) {

        System.out.println(new CountDistinctSlices().solution(5, new int[] {3, 4, 5, 5, 2}));
        System.out.println(new CountDistinctSlices().solution(7, new int[] {2, 7, 4, 6, 3}));
//        new CountDistinctSlices().solution(5, new int[] {3, 4, 5, 5, 2});
    }
    // M -upper bound of each element
    // A input list
    public int solution (int M, int[] A) {

        Set<Integer> uniqueItems = new HashSet<>();

        int count = 0;
        int back = 0;
        for (int i = 0; i < A.length-1; i++) {
            // create a slice(sub array from our array) that we can modify
            // Moving pointers
            int front = i;
            int size = (front - back) + 1;
            //int[] slice = Arrays.copyOfRange(A, back, front);
            while (!uniqueItems.contains(A[front])){
                uniqueItems.add(A[front]);
                count = count + size;
                front++;
                //count = front - back + 1;
                if (front == A.length){
                    count ++;
                    break;
                }
            }
            if (uniqueItems.contains(A[front])) {
                back ++;
            }
            // clean the unique items
            uniqueItems.clear();

        }
        // if count > 1.000.000.000 should return 1.000.000.000
        if (count > 1000000000) return 1000000000;

        return count;
    }

}
