package com.bogdantataru;

/*
/We use the integers a,b, and n to create the following series:

(a + 2^0 * b), (a + 2^0 * b + 2^1 * b),..., (a + 2^0 * b + 2^1 * b + ... + 2^n-1*b)

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

*/


import java.util.Scanner;

public class Series {

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            in.nextLine();
            int result = 0;
            for (int j = 0; j < n; j++) {
                if (j==0) {
                    result += (a + (fact(2, j) * b));
                } else {
                    result += fact(2,j)*b;
                }
                System.out.print(result + " ");
            }
        }
        in.close();
    }

    public static
    int fact(int x, int z){
        int value =(int) Math.pow(x , z);
        //System.out.println(value);
        return value;
    }

}
