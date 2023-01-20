package com.bogdantataru.eulerProject;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerDigitSum_16 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] arr = new long[t];
        for (int a = 0; a < t; a++) {
            int n = scanner.nextInt();

            double result = Math.pow(2, n);
            long sum = 0;
            while (result > 0){
                sum += result % 10;
                result = result / 10;

            }
            arr[a] = sum;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
