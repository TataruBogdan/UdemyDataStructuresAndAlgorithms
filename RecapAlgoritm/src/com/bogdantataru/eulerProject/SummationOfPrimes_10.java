package com.bogdantataru.eulerProject;

/*
    The sum of the primes below 10 is 2+3+5+7=17
    Find the sum of all the primes not greater than given N.
    The first line contains an integer T i.e. number of the test cases.
    The next T lines will contain an integer N.
     */

import java.util.Scanner;

public class SummationOfPrimes_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] num = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();

            int sum = 2;

            for (int i = 3; i <= n; i = i + 2) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            num[a0] = sum;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(num[i]);
        }
    }

    public static boolean isPrime(int number) {
        // daca numarul are radacina patrata ex 49 - 7 atunci pot sa nu mai caut numerele mai departe
        for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
