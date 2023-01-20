package com.bogdantataru;

public class DivCount {

    public static void main(String[] args) {

//        System.out.println(new DivCount().solution(6, 11, 2));
        System.out.println(new DivCount().solutionSchool(6,11,2));

    }

    public int solution(int A, int B, int K) {
        if (K > A || K > B) {
            return -1;
        }

        int count = 0;
        int[] array = null;

        if (B > A) {
            array = new int[(B-A) + 1];
        } else {
            array = new int[(A-B + 1)];
        }

        for (int i = 0; i <= array.length-1; i++ ) {
            array[i] = A+i;
            if (array[i] % K == 0) {
                count++;
            }
        }
        return count;
    }

    public int solutionSchool(int A, int B, int K) {

        double start = Math.ceil((double) A / K);
        double end = Math.floor((double) B / K);
        double result = end - start + 1;
        return (int) result;
    }


}
