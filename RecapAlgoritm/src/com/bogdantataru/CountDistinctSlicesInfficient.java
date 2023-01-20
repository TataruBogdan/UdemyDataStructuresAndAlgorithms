package com.bogdantataru;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDistinctSlicesInfficient {

    public static void main(String[] args) {
        System.out.println(new CountDistinctSlicesInfficient().solution(5, new int[] {3, 4, 5, 5, 2}));
    }


    public int solution (int M, int[] A) {

        Map<Integer,Integer> uniqueItems = new HashMap<Integer, Integer>();
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                for (int k = i; k <= j ; k++) {
                    count += 1;
                    System.out.print(A[k] + ", ");
                }
                System.out.println();
            }
        }
        return count;
    }
}
