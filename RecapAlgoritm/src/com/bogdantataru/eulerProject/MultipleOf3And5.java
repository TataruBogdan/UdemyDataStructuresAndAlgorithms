package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class MultipleOf3And5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long a = 0, b = 0, c = 0 ;
            // all numbers in sequence that are divisible with 3;
            // the common difference is 3
            // to find the number of terms, we take the last term and divide with 3
            a = (n - 1) / 3;
            // all numbers in sequence that are divisible with 5;
            // the common difference is 5
            // to find the number of terms, we take the last term and divide with 5
            b = (n - 1)  / 5;
            // because we have 3*5= 15, we have two times counting the sequence of 15
            // must be eliminated
            c = (n - 1)  / 15;

                    //(n-1) / 3 * (a1 * (n-1))
            long sum3 = (a * (3 + (n-1)))/2;
            long sum5 = (b * (5 + (n-1)))/2;
            long sum15 = (c * (15 + (n-1)))/2;

            long totalSum = sum3 + sum5 - sum15;
            //natural number below 10

            // number


            System.out.println(totalSum);
        }

    }

    /*public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i <= t; i++) {
            int n = scanner.nextInt();
            n = n-1;
            int sum = 0;

            while (n > 2) {
                if (n % 5 == 0 || n % 3 == 0) {
                    sum += n;
                }
                n--;
            }
            System.out.println(sum);
        }
    }*/
}
