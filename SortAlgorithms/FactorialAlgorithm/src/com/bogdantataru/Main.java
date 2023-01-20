package com.bogdantataru;

public class Main {

    public static void main(String[] args) {

       System.out.println(iterativeFactorial(3));

       System.out.println(recursiveFactorial(3));



    }

    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        //set the factorial to one
        int fact= 1;
        //set multiplier to 1
        for (int i = 1 ; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    // 1! - 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        //recursiveFactorial(0) -> 1
        //recursiveFactorial(1) -> 1
        //recursiveFactorial(2) -> 2
        // recursiveFactorial(3) -> 6
        return num * recursiveFactorial(num - 1) ;
    }

}
