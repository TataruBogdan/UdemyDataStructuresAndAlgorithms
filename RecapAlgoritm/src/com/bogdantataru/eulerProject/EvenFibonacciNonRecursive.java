package com.bogdantataru.eulerProject;

import java.util.Scanner;

public class EvenFibonacciNonRecursive {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            //creem un array cu n elemente
            int[] arr = new int[n+1];
            //introdicem primele doua elemente la indexul 0 si 1
            arr[0] = 1;
            arr[1] = 1;
            int sum = 0;
            //pentru indexul 2 - i=2
            for (int i = 2; i <= n; i++) {
                //adunam elementele de la i-1 si i-2
                arr[i] = arr[i-1] + arr[i-2];
                // daca elementul este par il adaugam la sum si a carei valoare nu depaseste n
                if ((arr[i] % 2 == 0 )&& arr[i] < n){
                    sum += arr[i];
                }
            }
            System.out.println((int) sum);
        }
    }


    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();

            long x0 = 0;
            long x1 = 1;
            long sum = 0;

            while (x1 <= n){
                // daca este par
                if (x1 % 2 == 0) {
                    sum += x1;
                }
                //
                long x2 = x1 + x0;

                //setam valorile ptr urmatoarea iterare
                x0 = x1;
                x1 = x2;
            }
            System.out.println(sum);

        }
    }*/
}
