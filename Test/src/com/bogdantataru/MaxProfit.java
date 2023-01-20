package com.bogdantataru;

public class MaxProfit {

    public static void main(String[] args) {

//        int[] array = new int[] {5, -4, 8, -10, -2, 4, -3, 2, 7, -8, 3, -5, 3};
        int[] array = new int[] {114, 132, 119, 91, 84, 29, 61, 76, 38, 21, 9, 63, 45, 68, 81, 124, 118, 78, 44, 59, 80};

        System.out.println(new MaxProfit().solution(array));
    }

    public int solution(int[] A) {

        int[] result = new int[A.length];

        for (int i = 0; i < A.length-1; i++) {
            int firstElement = A[i];
            int secondElement = A[i+1];
            result[i]  = secondElement - firstElement;
        }
        int globalMax = result[0]; // return the
        int localMax = result[0];
        int newEntry = 0;
        for (int i = 1; i < result.length-1; i++) {

            newEntry =result[i];
            if ((localMax + newEntry) > newEntry){
                localMax = (localMax + newEntry);
                if (localMax > globalMax) globalMax = localMax;

            } else if ((localMax + newEntry) < newEntry){
                localMax = newEntry;
            }
        }
        return globalMax;
    }
}
