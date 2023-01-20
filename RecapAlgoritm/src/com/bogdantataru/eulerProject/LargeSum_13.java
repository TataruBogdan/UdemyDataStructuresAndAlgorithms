package com.bogdantataru.eulerProject;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        BigInteger sum = new BigInteger("0");

        for (int a = 0; a < t; a++) {
            BigInteger N = scanner.nextBigInteger();
            sum = sum.add(N);
        }

        System.out.println(sum.toString().substring(0, 10));
    }
}
