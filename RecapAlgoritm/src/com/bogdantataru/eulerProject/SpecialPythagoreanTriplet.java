package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();

            int result;
            int maxValue = -1;
            int a,b,c;
            for (a = 1; a < n/3; a++) {
                b = (((n*n) - (2*a*n))/((2*n)-(2*a)));
                c = n - a - b;
                if ((((a*a) + (b*b)) == (c*c))){
                    result = a * b * c;
                    if (result > maxValue){
                        maxValue = result;
                    }
                }
            }
            arr[a0] = maxValue;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }
}
