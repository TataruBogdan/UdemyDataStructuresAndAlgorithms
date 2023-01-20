package com.bogdantataru.eulerProject;
/*
By listing the first six prime numbers:2,3,5,7,11 and 13 , we can see that the 6th prime is 13.
What is the nth prime number?
 */

import java.util.Scanner;

public class Prime10001st {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long[] arr = new long[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            long numberOfPrimes = 1;
            long startNumber = 3;
            long theNthPrime = 2;

            while(numberOfPrimes != n) {
                boolean prime = true;
                for (long i = 3; i < startNumber/2; i++) {
                    if (startNumber % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (startNumber > theNthPrime && prime) {
                    theNthPrime = startNumber;
                    numberOfPrimes++;
                }
                startNumber = startNumber + 2;
            }
            arr[a0] = theNthPrime;
        }
        for(int i = 0; i < t; i++){
            System.out.println(arr[i]);
        }
    }
}
