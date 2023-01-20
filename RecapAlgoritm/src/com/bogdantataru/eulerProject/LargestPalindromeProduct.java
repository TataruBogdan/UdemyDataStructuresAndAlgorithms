package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[] = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();

            int multiple = 0;
            int product = 0;
            for (int i = 999; i >= 100; i--) {
                for (int j = 999; j >= 100; j--) {
                    multiple = i * j;
                    if (palindromeCheck(multiple) ) {
                        if (multiple > product && multiple < n)
                            product = multiple;
                    }
                }
            }
            arr[a0] = product;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean palindromeCheck(long number) {

        long numberToCheck = number;
        long reversedNumber = 0;
        while (numberToCheck != 0) {
            long lastDigit = numberToCheck % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            numberToCheck = numberToCheck / 10;
        }
        return number == reversedNumber;
    }
}
