package com.bogdantataru.eulerProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestPrimeFactor {

    /*
    The prime factors of 13195 are 5, 7, 13, 29
    What is the largest prime factor of a given number N?

    think : How can we make a rectangle with area 13195
    x * y = 13195
     */
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();

            // avem nevoie de o List sa savam nr prime pe care le gasim
            List<Long> primeNumbers = new ArrayList<>();
            // cautam toate numerele prime pana la nr nostru
            // incepem in tot deauna de la 2 si daca gasim un numar care intra in nr nostru atunci stim ca nu este prim
            for (long i = 2; i <= n ; i++) {
                //este numarul even ?
                if (isPrime(i) && (n % i == 0)){
                    // daca prime n gasit is the largest factor of n
                    primeNumbers.add(i);
                }
            }
            //print the last element in the Arraylist
            int lastElem = primeNumbers.size() - 1;
            System.out.println(primeNumbers.get(lastElem));
        }
    }
    public static boolean isPrime(long number) {
        // pornim de la numarul 2 si pentru fiecare numar verificam daca numarul este even
        // i must be smaller or equal to our number

        for (long i = 2; i < number; i++) {
            // incepe, de la 2 pana la nr nostru incluivs  si comparam cu toate numerele mai mici decat numar
            // sa vedem daca exista vre-un numar care sa-l divida pe nr nostru
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long largestPrimeNumber = 0;
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();

            for(long i = 2; i <= Math.sqrt(n); i++ ){
                while ( n % i == 0 && n != i) {
                    n = n / i;
                }
                largestPrimeNumber = n;
            }
            System.out.println(largestPrimeNumber);
        }

    }

}
