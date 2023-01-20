package com.bogdantataru.eulerProject;

import java.util.*;

public class SieveOfEratosthenes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();

            System.out.println(sieveOfEratosthenes((int)n));
        }
    }

    /*
    For all numbers a: from 2 to sqrt(n)
        IF a is unmarked THEN
            a is PRIME
            FOR all multiples of a ( a < n)
                mark multiples as composite

     All unmarked numbers are prime !
     So we add them to a list
     */

    public static List<Integer> sieveOfEratosthenes(int n) {
        //create a array to store
        // we start at the beginning and we know that if a number is unmarked -> it's prime
        boolean prime[] = new boolean[n + 1];
        System.out.println(prime.length);
        // we suppose that all our numbers are prime
        Arrays.fill(prime, true);
        // 2 is prime because it's unmarked
        // 6 is already crossed of so we start at the square of that number p * p / 3 * 3 = 9
        //11 * 11 is greater them 100 so we stop at 10
        for (int a = 2; a * a <= Math.sqrt(n) ; a++) {
            //eliminate all multiples of two because there are composite
            if (prime[a]){
                // we jump along and eliminate all multiple of 2
                for (int i = a * 2; i <= n ; i += a) {
                    prime[i] = false;
                }
            }
            // we jump to 3 ....and so on
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

}
