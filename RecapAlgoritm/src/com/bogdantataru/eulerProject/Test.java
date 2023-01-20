package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int[] intArray = new int[t];

        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            int numberOfPrimes = 1;
            int nthPrimeNumber = 2;
            int number = 3;

            while (nthPrimeNumber != n) {

                boolean prime = true;
                for (int i = 3; i < number/2; i++) {
                    if (i % 2 == 0) {
                        prime = false;
                        break;
                    }

                }
                if (prime & number > nthPrimeNumber) {
                    nthPrimeNumber = number;
                    numberOfPrimes++;
                }

            }

        }

        for (int i = 0; i < t; i++) {
            System.out.println(intArray[i]);
        }

    }
}
