package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class EulerLargestPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long largestPrimeNumber = 0;
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();

            for(long i = 2; i <= Math.sqrt(n); i++){
                while ( n % i == 0 && n != i) {
                    n = n / i;
                }
                largestPrimeNumber = n;
            }
            System.out.println(largestPrimeNumber);
        }
    }
}
