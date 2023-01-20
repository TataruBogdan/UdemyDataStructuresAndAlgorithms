package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class SmallestMultiple {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];

        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();

            int divisibleNumber = 0;
            int smallestNumber = 1;

            while (true){
                int counter = n;
                boolean isNotDivisibleNumber = true;
                for (int i = 1; i <= n; i++) {
                    //if smallest number is divisible to each of the numbers from 1 to n
                    if (smallestNumber % i == 0) {
                        counter--;
                        if (counter == 0) {
                            divisibleNumber = smallestNumber;
                            isNotDivisibleNumber = false;
                            break;
                        }
                    }
                }
                if (!isNotDivisibleNumber){
                    break;
                }else {
                    smallestNumber++;
                }
            }
            arr[a0] = divisibleNumber;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }

}
