package com.bogdantataru;

public class Main {

    public static void main(String[] args) {

        //System.out.println(iterativeFactorial(3));
        printStar(5);

    }

    public static int iterativeFactorial(int num) {

        if (num < 0) {
            System.out.println("Number must be a positive number");
            return -1;
        }

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }

    // we're calling the method itself to get the value
    public static int recursiveFactorial(int num) {
        if (num == 0 ){
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    public static void printStar(int num) {
        if (num == 0){
            return;
        }

        if(num > 0) {
            for(int i  = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }




}
