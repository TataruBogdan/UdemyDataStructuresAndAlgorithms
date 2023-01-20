package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class largestProductInASeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] val = new int[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            // the size of the array is equal with N
            int[] arrOfDigits = new int[n];
            for (int i = 0; i < num.length(); i++){
                arrOfDigits[i] = num.charAt(i) - 48;
            }

            int start = 0;
            int maxValue = 0;
            for (int end = k-1; end < num.length(); end++) {
                int p = start;
                int currentValue = 1;

                while(p <= end) {
                    currentValue *= arrOfDigits[p];
                    p++;
                }
                if (currentValue > maxValue){
                    maxValue = currentValue;
                }
                start = start+1;
            }
            val[a0] = maxValue;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(val[i]);
        }

    }
}
