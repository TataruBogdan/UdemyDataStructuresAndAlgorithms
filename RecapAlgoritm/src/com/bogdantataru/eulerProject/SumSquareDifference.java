package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class SumSquareDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] sums = new long[t];

        for(int a0 = 0; a0 < t; a0++){
            long sumOfSquares = 0;
            long squareOfSums = 0;
            long number = 0;
            long answer = 0;
            int n = in.nextInt();

            for(long i = 1; i <= n; i++) {
                sumOfSquares += (int) Math.pow(i, 2);
            }

            for (long i = 1; i <= n ; i++) {
                number += i;
            }
            squareOfSums = (long) Math.pow(number, 2);

            answer = Math.abs(sumOfSquares - squareOfSums);
            sums[a0] = answer;
        }

        for (int i = 0; i < t; i++){
            System.out.println(sums[i]);
        }
    }
}
