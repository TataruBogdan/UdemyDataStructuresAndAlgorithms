package com.bogdantataru;

public class SumOfDigits {

    public static void main(String[] args) {

        int n = 687;

        System.out.println(getSum(n));
    }


    public static int getSum (int n) {

        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;

    }


}
