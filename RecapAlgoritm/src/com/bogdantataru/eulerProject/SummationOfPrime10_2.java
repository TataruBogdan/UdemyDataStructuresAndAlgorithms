package com.bogdantataru.eulerProject;

import java.util.Arrays;
import java.util.Scanner;

public class SummationOfPrime10_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] sumOfPrimeNum = new long[t];

        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            boolean[] primes = new boolean[n+1];
            long sum = 0;
            Arrays.fill(primes, true);
            for (int p = 2; p * p <= n; p++) {
                if (primes[p]) {
                    for (int i = 2 * p; i <= n; i += p) {
                        primes[i] = false;
                    }
                }else {
                    primes[p] = false;
                }

            }
            for (int i = 2; i <= n; i++) {
                if (primes[i]) {
                    sum += i;
                }
                sumOfPrimeNum[a0] = sum;
            }
            System.out.println(sumOfPrimeNum[a0]);
        }
    }
}
