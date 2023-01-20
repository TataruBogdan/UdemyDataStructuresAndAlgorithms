package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class EvenFibonacciNumbers {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();

            long x0 = 0;
            long x1 = 1;
            long sum = 0;

            while (x1 <= n){
                // check if it's even
                if (x1 % 2 == 0) {
                    sum += x1;
                }
                //
                long x2 = x1 + x0;

                //set the values for next iteration
                x0 = x1;
                x1 = x2;
            }
            System.out.println(sum);

        }
    }
}
