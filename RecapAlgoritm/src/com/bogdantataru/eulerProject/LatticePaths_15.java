package com.bogdantataru.eulerProject;

/*Starting in the top left corner of a 2 x 2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner
 How many such routes are there through a N X M grid? As number of ways can be very large, print it modulo (10^9 + 7) */

import java.util.Scanner;

public class LatticePaths_15 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] test = new long[t];
        for (int a = 0; a < t; a++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            /*[0,1]  [1,0]
              [1,0]  [0,1]*/

            long latticePaths = latticePaths(N, M);
            //latticePaths = latticePaths / 2;

            test[a] = latticePaths;
        }

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
    public static long latticePaths(int N, int M){
        if (N==0 && M==0) {
            return 1;
        }

        return (factorial(N+M) / (factorial(N) * factorial(M)) % 1000000007) ;
    }

    public static long factorial(int n){
        if (n < 2){
            return 1;
        }
        return n * factorial(n-1);
    }

}
